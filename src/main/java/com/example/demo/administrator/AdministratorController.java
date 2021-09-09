package com.example.demo.administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AdministratorController {
    private final AdministratorService administratorService;

    @Autowired
    public AdministratorController(AdministratorService administratorService) {
        this.administratorService = administratorService;
    }

    @GetMapping("/administrator")
    public List<Administrator> getAdministrators() {
        return administratorService.getAdministrators();
    }

    @PostMapping("/administrator")
    public void registerNewAdministrator(@RequestBody Administrator administrator) {
        administratorService.addNewAdministrator(administrator);
    }

    @DeleteMapping(path = "/administrator/{administratorId}")
    public void deleteAdministrator(@PathVariable("administratorId") Long id) {
        administratorService.deleteAdministrator(id);
    }

}
