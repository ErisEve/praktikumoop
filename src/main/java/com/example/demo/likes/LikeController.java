package com.example.demo.likes;

// import com.example.demo.likes.Like;
// import com.example.demo.likes.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import javax.transaction.Transactional;
import java.util.List;

@RestController
public class LikeController {
    private final LikeService likeService;

    @Autowired
    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    @GetMapping("/likes")
    public List<Liked> getLike(){
        return likeService.getLikes();
    }
    @PostMapping("/likes")
    public void registerNewLike(@RequestBody Liked like){
        likeService.addNewLike(like);
    }
    @DeleteMapping(path="/like/{likeId}")
    public void deleteLike(@PathVariable("likeId") Long id){
        likeService.deleteLike(id);
    }

}