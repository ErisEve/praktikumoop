package com.example.demo;

// import com.example.demo.administrator.Administrator;
import com.example.demo.ads.Ad;
import java.util.List;
import com.example.demo.likes.Liked;
// import com.example.demo.ads.AdRepository;
import com.example.demo.ads.AdService;
import com.example.demo.comments.CommentService;
import com.example.demo.applications.Application;
import com.example.demo.applications.ApplicationService;
import com.example.demo.customers.Candidate;
import com.example.demo.customers.CandidateService;
import com.example.demo.employers.Employer;
import com.example.demo.employers.EmployerService;
import com.example.demo.administrator.Administrator;
import com.example.demo.administrator.AdministratorService;
import com.example.demo.jobs.JobService;
import com.example.demo.likes.LikeService;
import com.example.demo.comments.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Iterator;


@Controller
public class AppController {
    User currentUser;
    String type = "unregistered";
    String adminCase = "space";
    String isliked = "not";
    @Autowired
    AdService adService;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private EmployerService employerService;
    @Autowired
    private JobService jobService;
    @Autowired
    private  AdministratorService administratorService;
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private LikeService likeService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/OglasiImi")
    public String getPocetna(Model model, String usrname, String pswrd) {
        if (usrname != null && pswrd != null) {
            //find by username, password
            // userValidator.validate(o, errors);
            if(candidateService.findByUsername(usrname)!=null) currentUser = (User) candidateService.findByUsername(usrname);
            if(employerService.findByUsername(usrname)!=null) currentUser = (User) employerService.findByUsername(usrname);
            if(administratorService.findByUsername(usrname)!=null) currentUser = (User) administratorService.findByUsername(usrname);
            if(currentUser == null){
                System.out.println(">>>>>>>>>You basic retard");
                return "prijava";
            }
            if(currentUser.getPassword().equals(pswrd)){
                // type = currentUser.type;
                if(currentUser instanceof Candidate) type="candidate";
                if(currentUser instanceof Employer) type="employer";
                if(currentUser instanceof Administrator) type="admin";
                model.addAttribute("currentUser", currentUser);
                model.addAttribute("jobs", jobService.getJobs());
                model.addAttribute("emps", employerService.getEmployers());
                model.addAttribute("type", type);
                System.out.println(">>>>>>>>>Finally understand what you want from me");
                return "pocetna";
            }else{
                //wrong input error message
                System.out.println(">>>>>>>>>I dont understand you at all");
                return "prijava";
            }
            
        } else {
            model.addAttribute("currentUser", currentUser);
             model.addAttribute("jobs", jobService.getJobs());
            model.addAttribute("emps", employerService.getEmployers());
            model.addAttribute("type", type);
            System.out.println(">>>>>>>>>Whatever the fuck was that");
            return "pocetna";
        }
        
        
    }

    @GetMapping("/OglasiImi/poslovi/oglas/konkurisi/{id}")
    public String getKonkurisi(@PathVariable Long id, Model model) {
        model.addAttribute("applicationForm", new Application(currentUser.getId(), id));
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        // model.addAttribute("adId", id);
        return "konkurisi";
    }

    @PostMapping("/OglasiImi/poslovi/oglas/konkurisi/{id}")
    public String fillTheApplicationForm(@PathVariable Long id, @ModelAttribute("applicationForm") Application applicationForm){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        applicationService.addNewApplication(applicationForm);
        System.out.println(applicationForm);
        return "successful";
    }

    @GetMapping("/OglasiImi/postaviOglas")
    public String getPostOglasForm(Model model){
        model.addAttribute("adForm", new Ad(currentUser.getId()));
        System.out.println("++++++++++++++++++++++++");
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        return "posaoforma";
    }

    @PostMapping("/OglasiImi/postaviOglas")
    public String fillTheAdForm(@ModelAttribute("adForm") Ad adForm){
        adForm.setEmpId(currentUser.getId());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(adForm);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        adService.addNewAd(adForm);
        return "successful";
    }

    @GetMapping("/OglasiImi/registracija")
    public String getRegistracija(Model model) {
        model.addAttribute("userForm", new Candidate());
        return "registracijaKandidat";
    }

    @PostMapping("/OglasiImi/registracija")
    public String registerCandidate(@ModelAttribute("userForm") Candidate userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            return "registracijaKandidat";
        }
        candidateService.addNewCandidate(userForm);
        System.out.println(userForm.toString());
        currentUser = userForm;
        type="candidate";
        return "successful";
    }

    @GetMapping("/OglasiImi/registracijaKompanije")
    public String getRegistracijaPoslodavac(Model model) {
        model.addAttribute("userForm", new Employer());
        return "registracijaPoslodavac";
    }

    @PostMapping("/OglasiImi/registracijaKompanije")
    public String registerEmployer(@ModelAttribute("userForm") Employer userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            return "registracijaPoslodavac";
        }
        currentUser = userForm;
        employerService.addNewEmployer(userForm);
        type="employer";
        return "pocetna";
    }

    @GetMapping("/OglasiImi/prijava")
    public String getPrijava(Model model) {
        currentUser = null;
        type = "unregistered";
        return "prijava";
    }

    public List<Ad> filterAdsByJob(String job, List<Ad> ads) {
        for (Iterator<Ad> it = ads.iterator(); it.hasNext();) {
            Ad ad = it.next();
            if (ad.getJob().indexOf(job) == -1) {
                it.remove();
            }
        }
        return ads;
    }

    @GetMapping("/filter")
    // @ResponseBody
    public String filterAds(@RequestParam(required = false) String keyword, @RequestParam(required = false) String job, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        if (keyword != null) {
            if (job != null) {
                model.addAttribute("keyword", filterAdsByJob(job, adService.getSpecifiedAds(keyword)));
                System.out.println("We have both keyword and job");
                System.out.println(job);
            } else {
                System.out.println("We have keyword but no job");
                model.addAttribute("keyword", adService.getSpecifiedAds(keyword));
                System.out.println(job);
            }
        } else {
            if (job != null ) {
                System.out.println("We have no keyword but we have job");
                model.addAttribute("keyword", filterAdsByJob(job, adService.getAds()));
                System.out.println(job);
            } else {
                System.out.println("We have no keyword and no job");
                System.out.println(job);
                model.addAttribute("keyword", adService.getAds());
            }
        }
        return "listaposlova";
    }

    private boolean checkIfLiked(List<Liked> likes, Long id){
        for (Liked liked : likes) {
            if(liked.getIdAd()==id) return true;
        }
        return false;
    }

    @GetMapping("/OglasiImi/poslovi/oglas/{id}")
    public String getOglas(@PathVariable Long id, Model model) {
        Ad ad = adService.getAdById(id);
        ad.incrementViewCount();
        adService.updateAd(ad);
        isliked = "not";
        List<Liked> likes = likeService.findLikeByIdCandidate(currentUser.getId());
        if(likes!=null && checkIfLiked(likes, ad.getId())) isliked = "yes";
        if(currentUser instanceof Candidate) { 
            model.addAttribute("newCom", new Comment(null, currentUser.getId(), ad.getId()));
        }else{
            model.addAttribute("newCom", new Comment(currentUser.getId(),null, ad.getId()));
        }
        model.addAttribute("isliked",isliked);
        model.addAttribute("ad", ad);
        model.addAttribute("currentUser", currentUser);
        System.out.println(type);
        model.addAttribute("type", type);
        model.addAttribute("coms", commentService.getCommentsByIdAd(ad.getId()));
        return "oglas";
    }

    @PostMapping("/OglasiImi/poslovi/oglas/{id}/comment")
    public String postaviKomentar(@PathVariable Long id, Model model, @ModelAttribute("newCom") Comment newCom){
        Ad ad = adService.getAdById(id);
        model.addAttribute("type", type);
        model.addAttribute("isliked",isliked);
        model.addAttribute("ad", ad);
        model.addAttribute("currentUser", currentUser);
        commentService.addNewComment(newCom);
        model.addAttribute("coms", commentService.getCommentsByIdAd(ad.getId()));
        return "oglas";
    }

    @PostMapping("/OglasiImi/poslovi/oglas/{id}/liked")
    public String likeOglas(@PathVariable Long id, Model model){
        Ad ad = adService.getAdById(id);
        System.out.println(ad);
        ad.incrementLikeCount();
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("type", type);
        adService.updateAd(ad);
        System.out.println(ad);
        isliked = "yes";
        model.addAttribute("isliked",isliked);
        model.addAttribute("ad", ad);
        System.out.println(new Liked(ad.getId(),currentUser.getId()));
        likeService.addNewLike(new Liked(ad.getId(),currentUser.getId()));
        return "oglas";
    }

    @GetMapping("/OglasiImi/profileCandidate")
    public String getProfilKandidata(@ModelAttribute("userForm") Candidate userForm, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("applications", applicationService.getApplicationsByCandidateId(currentUser.getId()));
        if (currentUser instanceof Employer && (userForm == null || userForm.getUsername() == null))
            return "unsuccessful";
        if (userForm == null)
            userForm = (Candidate) currentUser;
        if (userForm.getUsername() == null)
            userForm = (Candidate) currentUser;
        model.addAttribute("userForm", userForm);
        model.addAttribute("canChange", "yes");
        return "profilKand";
    }

    @GetMapping("/OglasiImi/changeInfo")
    public String changeAccInfo(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("userForm", new Candidate());
        System.out.println(">>>>>>>>>>>>okay the hell?>>>>>>>>>>>>>>>>");
        System.out.println(currentUser);
        return "profilKandChange";
    }

    @PostMapping("/OglasiImi/changeInfo")
    public String accountInfoSaved(@ModelAttribute("userForm") Candidate userForm, Model model){
        System.out.println(">>>>>>>>>>>>I DID NOTHING WRONG>>>>>>>>>>>>>>>>");
        System.out.println(userForm.getFirstname());
        if(!userForm.getFirstname().equals("")) ((Candidate)currentUser).setFirstname(userForm.getFirstname());
        if(!userForm.getLastname().equals("")) ((Candidate)currentUser).setLastname(userForm.getLastname());
        if(!userForm.getAddress().equals("")) ((Candidate)currentUser).setAddress(userForm.getAddress());
        if(!userForm.getEmail().equals("")) ((Candidate)currentUser).setEmail(userForm.getEmail());
        if(!userForm.getDateOfBirth().equals("")) ((Candidate)currentUser).setDateOfBirth(userForm.getDateOfBirth());
        if(!userForm.getTelephoneNumber().equals("")) ((Candidate)currentUser).setTelephoneNumber(userForm.getTelephoneNumber());
        candidateService.updateCandidate((Candidate)currentUser);
        System.out.println(currentUser);
        System.out.println(">>>>>>>>>>>>Hello from the other side>>>>>>>>>>>>>>>>");
        model.addAttribute("userForm", currentUser);
        return "successful";
    }

    @GetMapping("/OglasiImi/kandidat/{id}")
    public String getProfilNekogKandidata(Model model, @PathVariable Long id){
        Candidate userForm = candidateService.getCandidateById(id);
        model.addAttribute("userForm",userForm);
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("type", type);
        model.addAttribute("canChange", "no");
        return "profilKand";
    }
    @GetMapping("/OglasiImi/poslodavac/{id}")
    public String getProfilNekogPoslodavca(Model model, @PathVariable Long id){
        Employer userForm = employerService.getEmployerById(id);
        model.addAttribute("userForm",userForm);
        model.addAttribute("currentUser", currentUser);
        model.addAttribute("type", type);
        model.addAttribute("ads", adService.findAdByEmpId(userForm.getId()));
        return "profilPoslodavca";
    }

    @GetMapping("/OglasiImi/profileCompany")
    public String getProfilPoslodavca(@ModelAttribute("userForm") Employer userForm, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        if (currentUser instanceof Candidate && (userForm == null || userForm.getUsername() == null))
            return "unsuccessful";
        if (userForm == null)
            userForm = (Employer) currentUser;
        if (userForm.getUsername() == null)
            userForm = (Employer) currentUser;
        model.addAttribute("userForm", userForm);
        model.addAttribute("ads", adService.findAdByEmpId(currentUser.getId()));
        return "profilPoslodavca";
    }

   @GetMapping("/OglasiImi/AdmininstratorSpace")
   public String getAdminSpace(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        adminCase = "space";
        model.addAttribute("adminCase", adminCase);
       return "admin";
   }
   @GetMapping("/OglasiImi/AdmininstratorSpace/candidates")
   public String getAdminCandidateList(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        adminCase = "candidate";
        model.addAttribute("adminCase", adminCase);
        model.addAttribute("candidates", candidateService.getCandidate());
       return "admin";
   }
   @GetMapping("/OglasiImi/AdmininstratorSpace/employers")
   public String getAdminEmployersList(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        adminCase = "employer";
        model.addAttribute("adminCase", adminCase);
        model.addAttribute("employers", employerService.getEmployers());
       return "admin";
   }
   @GetMapping("/OglasiImi/AdmininstratorSpace/ads")
   public String getAdminAdList(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        adminCase = "ad";
        model.addAttribute("adminCase", adminCase);
        model.addAttribute("ads", adService.getAds());
       return "admin";
   }
   @GetMapping("/OglasiImi/AdmininstratorSpace/comments")
   public String getAdminCommentList(Model model){
        model.addAttribute("type", type);
        model.addAttribute("currentUser", currentUser);
        adminCase = "comment";
        model.addAttribute("adminCase", adminCase);
        model.addAttribute("comments", commentService.getComments());
       return "admin";
   }
}
