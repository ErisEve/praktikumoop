package com.example.demo.likes;

// import com.example.demo.likes.Like;
// import com.example.demo.likes.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
// import java.util.Optional;

@Service
public class LikeService {
    private final LikeRepository likeRepository;

    @Autowired
    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }
    public List<Liked> getLikes(){
        return likeRepository.findAll();
    }

    public void addNewLike(Liked like) {
        likeRepository.save(like);
    }
    public List<Liked> findLikeByIdCandidate(Long id){
        return likeRepository.findByIdCandidate(id);
    }
    public List<Liked> findLikeByIdAd(Long id){
        return likeRepository.findByIdAd(id);
    }
    public void deleteLike(Long id) {
        boolean b = likeRepository.existsById(id);
        if(!b){
            throw new IllegalStateException("Like doesn't exists");
        }
        likeRepository.deleteById(id);
    }
}