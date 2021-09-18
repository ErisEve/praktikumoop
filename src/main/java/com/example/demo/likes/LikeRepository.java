package com.example.demo.likes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Liked, Long> {
    List<Liked> findByIdCandidate(Long idCandidate);
    List<Liked> findByIdAd(Long IdAd);
}