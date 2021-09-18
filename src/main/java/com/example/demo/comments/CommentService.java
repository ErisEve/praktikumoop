package com.example.demo.comments;

// import com.example.demo.comments.Comment;
// import com.example.demo.comments.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
    public List<Comment> getCommentsByIdAd(Long idAd){
        return commentRepository.findCommentsByIdAd(idAd);
    }
    public void addNewComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void deleteComment(Long id) {
        boolean b = commentRepository.existsById(id);
        if(!b){
            throw new IllegalStateException("Comment doesn't exists");
        }
        commentRepository.deleteById(id);
    }
}