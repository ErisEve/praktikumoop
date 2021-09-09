package com.example.demo.ads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AdController {
    private final AdService adService;

    @Autowired
    public AdController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/ads")
    public List<Ad> getAds() {
        return adService.getAds();
    }

    @PostMapping("/ads")
    public void registerNewAd(@RequestBody Ad ad) {
        adService.addNewAd(ad);
    }

    @DeleteMapping(path = "/ads/{adId}")
    public void deleteAd(@PathVariable("adId") Long id) {
        adService.deleteAd(id);
    }
    // add update method
}
