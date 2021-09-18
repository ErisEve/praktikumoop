package com.example.demo.ads;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

// @Query(value = "SELECT * FROM ad WHERE LOCATE(:substr,description)!=0",nativeQuery = true)
//     List<Ad> findSpecifiedAds(@Param("substr") String substr);

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {
    @Query(value = "SELECT * FROM ad a WHERE a.description like %:keyword%", nativeQuery = true)
    List<Ad> findSpecifiedAds(@Param("keyword") String keyword);
    Ad findAdById(long id);
    List<Ad> findAdByEmpId(Long empId);
    
}
