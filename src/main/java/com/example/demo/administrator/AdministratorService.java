package com.example.demo.administrator;

import com.example.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdministratorService extends UserService {
    private final AdministratorRepository administratorRepository;

    @Autowired
    public AdministratorService(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    public List<Administrator> getAdministrators() {
        return administratorRepository.findAll();
    }

    public void addNewAdministrator(Administrator administrator) {
        administratorRepository.save(administrator);
    }

    public void deleteAdministrator(Long id) {
        boolean b = administratorRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Administrator ne postoji");
        }
        administratorRepository.deleteById(id);
    }

    @Override
    public Object findByUsername(CharSequence username) {
        return administratorRepository.findByUsername(username);
    }
}
