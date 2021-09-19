package com.example.demo.ads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdService {
    private final AdRepository adRepository;
    private static Long lastid=0L;
    
    @Autowired
    public AdService(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    public List<Ad> getAds() {
        return adRepository.findAll();
    }

    public Ad getAdById(Long id){
        return adRepository.findAdById(id);
    }
    public List<Ad> findAdByEmpId(Long id){
        return adRepository.findAdByEmpId(id);
    }
    public List<Ad> getSpecifiedAds(String keyword) {
        System.out.println(keyword);
        return adRepository.findSpecifiedAds(keyword);
    }

    public void addNewAd(Ad ad) {
        if(adRepository.existsById(ad.getId())) ad.setId(lastid+1L);
        lastid=lastid+1L;
        adRepository.save(ad);
    }

    public void updateAd(Ad ad){
        adRepository.save(ad);
    }

    public void deleteAd(Long id) {
        boolean b = adRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Ad with that id doesn't exist");
        }
        adRepository.deleteById(id);
    }
}
