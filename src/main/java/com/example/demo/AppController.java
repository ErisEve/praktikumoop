package com.example.demo;

// import com.example.demo.administrator.Administrator;
import com.example.demo.ads.Ad;
import com.example.demo.ads.AdService;
import com.example.demo.customers.Candidate;
import com.example.demo.customers.CandidateService;
import com.example.demo.employers.Employer;
import com.example.demo.employers.EmployerService;
// import com.example.demo.administrators.Administrator;
import com.example.demo.administrator.AdministratorService;
import com.example.demo.jobs.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

class SearchInput {
    private String selectedOptionKljucnaRec;
    private String selectedOptionCategory;
    private String selectedOptionSubcategory;

    public SearchInput(String selectedOptionKljucnaRec) {
        System.out.println(selectedOptionKljucnaRec);
        this.selectedOptionKljucnaRec = selectedOptionKljucnaRec;
    }

    @Override
    public String toString() {
        return "SearchInput{" + "selectedOptionKljucnaRec='" + selectedOptionKljucnaRec + '\''
                + ", selectedOptionCategory='" + selectedOptionCategory + '\'' + ", selectedOptionSubcategory='"
                + selectedOptionSubcategory + '\'' + '}';
    }

    public SearchInput(String selectedOptionKljucnaRec, String selectedOptionCategory,
            String selectedOptionSubcategory) {
        System.out.println(selectedOptionKljucnaRec + ' ' + selectedOptionCategory + ' ' + selectedOptionSubcategory);
        this.selectedOptionKljucnaRec = selectedOptionKljucnaRec;
        this.selectedOptionCategory = selectedOptionCategory;
        this.selectedOptionSubcategory = selectedOptionSubcategory;
    }

    public SearchInput() {
    }

    public void setSelectedOptionKljucnaRec(String selectedOptionKljucnaRec) {
        this.selectedOptionKljucnaRec = selectedOptionKljucnaRec;
    }

    public void setSelectedOptionCategory(String selectedOptionCategory) {
        this.selectedOptionCategory = selectedOptionCategory;
    }

    public void setSelectedOptionSubcategory(String selectedOptionSubcategory) {
        this.selectedOptionSubcategory = selectedOptionSubcategory;
    }

    public String getSelectedOptionKljucnaRec() {
        return selectedOptionKljucnaRec;
    }

    public String getSelectedOptionCategory() {
        return selectedOptionCategory;
    }

    public String getSelectedOptionSubcategory() {
        return selectedOptionSubcategory;
    }
}

@Controller
public class AppController {
    User currentUser;
    String type = "unregistered";
    SearchInput kljucna;
    // Ad currentAd;
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
                type = "registered";
                model.addAttribute("currentUser", currentUser);
                model.addAttribute("jobs", jobService.getJobs());
                model.addAttribute("emps", employerService.getEmployers());
                model.addAttribute("type", type);
                model.addAttribute("kljucnarec", new SearchInput());
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
            model.addAttribute("kljucnarec", new SearchInput());
            System.out.println(">>>>>>>>>Whatever the fuck was that");
            return "pocetna";
        }
        
        
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
        type = "candidate";
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
        type = "employer";
        return "pocetna";
    }

    @GetMapping("/OglasiImi/prijava")
    public String getPrijava(Model model) {
        currentUser = null;
        type = "unregistered";
        return "prijava";
    }

    // @GetMapping("/OglasiImi/poslovi")
    // public String getListaPoslova(Model model) {
    // System.out.println("ovde -> OglasiImi/poslovi");
    // model.addAttribute("type", type);
    // System.out.println(kljucna.toString());
    // if (kljucna == null) {
    // model.addAttribute("selecetedOptionKljucnaRec", "");
    // model.addAttribute("ads", adService.getAds());
    // } else {
    // model.addAttribute("ads",
    // adService.getSpecifiedAds(kljucna.getSelectedOptionKljucnaRec()));
    // }

    // return "listaposlova";
    // }

    // @GetMapping("/success")
    // public String getSuccess(@ModelAttribute("kljucnarec") SearchInput
    // kljucnarec, Model model) {
    // System.out.println(kljucnarec);
    // System.out.println("ovde -> success");
    // kljucna = kljucnarec;
    // return "success";
    // }

    @GetMapping("/filter")
    public String filterAds(Model model, String keyword) {
        if (keyword != null) {
            model.addAttribute("keyword", adService.getSpecifiedAds(keyword));
        } else {
            System.out.println("Keyword is empty!");
        }
        return "listaposlova";
    }

    @GetMapping("/OglasiImi/poslovi/oglas/{id}")
    public String getOglas(@ModelAttribute("ad") Ad ad, Model model) {
        model.addAttribute("ad", ad);
        // model.addAttribute("userForm", currentUser);
        System.out.println(ad);
        model.addAttribute("type", type);
        return "oglas";
    }

    @GetMapping("/OglasiImi/profileCandidate")
    public String getProfilKandidata(@ModelAttribute("userForm") Candidate userForm, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("user", currentUser);
        if (currentUser instanceof Employer && (userForm == null || userForm.getUsername() == null))
            return "unsuccessful";
        if (userForm == null)
            userForm = (Candidate) currentUser;
        if (userForm.getUsername() == null)
            userForm = (Candidate) currentUser;
        model.addAttribute("userForm", userForm);
        return "profilKand";
    }

    @GetMapping("/OglasiImi/profileCompany")
    public String getProfilPoslodavca(@ModelAttribute("userForm") Employer userForm, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("user", currentUser);
        if (currentUser instanceof Candidate && (userForm == null || userForm.getUsername() == null))
            return "unsuccessful";
        if (userForm == null)
            userForm = (Employer) currentUser;
        if (userForm.getUsername() == null)
            userForm = (Employer) currentUser;
        model.addAttribute("userForm", userForm);
        return "profilPoslodavca";
    }

    @GetMapping("/OglasiImi/poslovi/oglas/konkurisi")
    public String getKonkurisi(Model model) {
        model.addAttribute("type", type);
        return "konkurisi";
    }
}
