package com.example.demo;

import com.example.demo.administrator.Administrator;
import com.example.demo.administrator.AdministratorService;
import com.example.demo.customers.Candidate;
import com.example.demo.customers.CandidateService;
import com.example.demo.employers.Employer;
import com.example.demo.employers.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    private UserService userService;
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private EmployerService employerService;
    @Autowired
    private AdministratorService administratorService;

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (o instanceof Candidate)
            userService = candidateService;
        if (o instanceof Employer)
            userService = employerService;
        if (o instanceof Administrator)
            userService = administratorService;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }

        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        // if (!user.getPasswordConfirm().equals(user.getPassword())) {
        // errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        // }
    }
}
