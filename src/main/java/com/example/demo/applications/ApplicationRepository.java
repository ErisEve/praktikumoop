package com.example.demo.applications;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> getByIdClient(Long idClient);
    List<Application> getByIdAd(Long idAd);
}