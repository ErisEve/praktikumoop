package com.example.demo.comments;

// import com.example.demo.comments.Comment;
// import com.example.demo.comments.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// import javax.transaction.Transactional;
import java.util.List;

@RestController
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comments")
    public List<Comment> getComment(){
        return commentService.getComments();
    }
    @PostMapping("/comments")
    public void registerNewComment(@RequestBody Comment comment){
        commentService.addNewComment(comment);
    }
    @DeleteMapping(path="/comment/{commentId}")
    public void deleteComment(@PathVariable("commentId") Long id){
        commentService.deleteComment(id);
    }

}