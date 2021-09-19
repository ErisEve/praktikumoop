package com.example.demo;

import com.example.demo.administrator.Administrator;
import com.example.demo.administrator.AdministratorRepository;
import com.example.demo.ads.Ad;
import com.example.demo.ads.AdRepository;
import com.example.demo.customers.Candidate;
import com.example.demo.customers.CandidateRepository;
import com.example.demo.employers.Employer;
import com.example.demo.employers.EmployerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(EmployerRepository employerRepository, CandidateRepository candidateRepository, AdRepository adRepository, AdministratorRepository administratorRepository){
        return args -> {
            Candidate cust = new Candidate(
                    "Mina",
                    "Nikol",
                    "2000-01-12",
                    "nkolidmina@gmail.com",
                    "Cegarska",
                    "erisevergreen",
                    "codeeris",
                    true,
                    "0603709222",
                    "2 years"
            );
            Candidate cust1 = new Candidate(
                    "Joca",
                    "Vujk",
                    "2003-15-02",
                    "jovicavuk@gmail.com",
                    "Cegarska",
                    "jovicavuk",
                    "jovicavuk123",
                    true,
                    "0603769222",
                    "1 year"
            );
            List<Candidate> list = new ArrayList<Candidate>();
            list.add(cust);
            list.add(cust1);
            candidateRepository.saveAll(list);
            Employer emp = new Employer(
                    "Lidl",
                    "Kg",
                    "prodaja",
                    "7249974",
                    "lidl@lidl.com",
                    "34000",
                    "Srbija",
                    "Save Petkovica",
                    "35546",
                    "lidlgo",
                    "khdfgjks",
                    true,
                    "gdgd/sffjk/hsgkg.com"
            );
            Employer emp1 = new Employer(
                    "Trnava",
                    "Kg",
                    "prodaja",
                    "628480",
                    "trnava@trnava.com",
                    "34000",
                    "Srbija",
                    "Sime Zivkovica",
                    "98284",
                    "trnavapromet",
                    "sfallkajgg",
                    true,
                    "gkjkk/hgghkjl/gfhgk.com"
            );
            List<Employer> list1 = new ArrayList<Employer>();
            list1.add(emp);
            list1.add(emp1);
            employerRepository.saveAll(list1);
            Administrator adm1 = new Administrator(
                    "carlos123",
                    "carlos123"
            );
            administratorRepository.save(adm1); 
            Ad ad1 = new Ad(
                    "We need someone to take care of this garbage",
                //     LocalDate.of(2021, Month.JANUARY,25),
                "25.03.2022",
                    false,
                    0,
                    0,
                    "programming",
                        1L
            );
            Ad ad2 = new Ad(
                    "Hello from the other sideee",
                //     LocalDate.of(2021, Month.JANUARY,25),
                "25.03.2022",
                    false,
                    0,
                    0,
                    "programming",
                    1L
            );
            Ad ad3 = new Ad(
                    "I dont think this is okay",
                //     LocalDate.of(2021, Month.JANUARY,25),
                "25.03.2022",
                    false,
                    0,
                    0,
                    "programming",
                    2L
            );
            List<Ad> list2 = new ArrayList<Ad>();
            list2.add(ad1);
            list2.add(ad2);
            list2.add(ad3);
            adRepository.saveAll(list2);


        };
    }
}
