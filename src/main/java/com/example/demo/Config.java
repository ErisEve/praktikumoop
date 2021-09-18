package com.example.demo;

import com.example.demo.administrator.Administrator;
import com.example.demo.administrator.AdministratorRepository;
import com.example.demo.ads.Ad;
import com.example.demo.ads.AdRepository;
import com.example.demo.customers.Candidate;
import com.example.demo.customers.CandidateRepository;
import com.example.demo.employers.Employer;
import com.example.demo.employers.EmployerRepository;
// import com.example.demo.jobs.Job;
import com.example.demo.jobs.JobRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import java.time.LocalDate;
// import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(EmployerRepository employerRepository, CandidateRepository candidateRepository, AdRepository adRepository, JobRepository jobRepository, AdministratorRepository administratorRepository){
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

        //     Job j1 = new Job(
        //             "IT",
        //             "Administrator baza",
        //             Long.valueOf(1)

        //     );
        //     Job j2 = new Job(
        //             "IT",
        //             "CRM software",
        //             Long.valueOf(2)

        //     );
        //     Job j3 = new Job(
        //             "IT",
        //             "ERP software",
        //             Long.valueOf(3)

        //     );
        //     Job j4 = new Job(
        //             "IT",
        //             "Informaciona bezbednost",
        //             Long.valueOf(4)

        //     );
        //     Job j5 = new Job(
        //             "IT",
        //             "Mrezni administrator",
        //             Long.valueOf(5)

        //     );
        //     Job j6 = new Job(
        //             "IT",
        //             "Sistemski administrator",
        //             Long.valueOf(6)

        //     );
        //     Job j7 = new Job(
        //             "Finansije",
        //             "Finanskijski analiticar",
        //             Long.valueOf(7)

        //     );
        //     Job j8 = new Job(
        //             "Finansije",
        //             "Procenitelj osiguranja",
        //             Long.valueOf(8)

        //     );
        //     Job j9 = new Job(
        //             "Finansije",
        //             "Blagajnik",
        //             Long.valueOf(9)

        //     );Job j10 = new Job(
        //             "Finansije",
        //             "Poreski pripravnik",
        //             Long.valueOf(10)

        //     );
        //     Job j11 = new Job(
        //             "Finansije",
        //             "Licni finansijski savetnik",
        //             Long.valueOf(11)

        //     );
        //     Job j12 = new Job(
        //             "Edukacija",
        //             "Profesor srpskog jezika",
        //             Long.valueOf(12)

        //     );
        //     Job j13 = new Job(
        //             "Edukacija",
        //             "Profesor matematike",
        //             Long.valueOf(13)

        //     );
        //     Job j14 = new Job(
        //             "Edukacija",
        //             "Profesor geografije",
        //             Long.valueOf(14)

        //     );
        //     Job j15 = new Job(
        //             "Edukacija",
        //             "Profesor filozofije",
        //             Long.valueOf(15)

        //     );
        //     Job j16 = new Job(
        //             "Edukacija",
        //             "Profesor sociologije",
        //             Long.valueOf(16)

        //     );
        //     Job j17 = new Job(
        //             "Edukacija",
        //             "Profesor istorije",
        //             Long.valueOf(17)

        //     );
        //     Job j18 = new Job(
        //             "Edukacija",
        //             "Profesor engleskog jezika",
        //             Long.valueOf(18)

        //     );
        //     Job j19 = new Job(
        //             "Edukacija",
        //             "Profesor nemackog jezika",
        //             Long.valueOf(19)

        //     );
        //     Job j20 = new Job(
        //             "Edukacija",
        //             "Profesor fizickog vaspitanja",
        //             Long.valueOf(20)

        //     );
        //     Job j21 = new Job(
        //             "Edukacija",
        //             "Profesor informatike",
        //             Long.valueOf(21)

        //     );
        //     Job j22 = new Job(
        //             "Edukacija",
        //             "Ucitelj",
        //             Long.valueOf(22)

        //     );
        //     Job j23 = new Job(
        //             "Edukacija",
        //             "Pedagog",
        //             Long.valueOf(23)

        //     );
        //     Job j24 = new Job(
        //             "Umetnost",
        //             "Glumac",
        //             Long.valueOf(24)

        //     );
        //     Job j25 = new Job(
        //             "Umetnost",
        //             "Profesor umetnosti",
        //             Long.valueOf(25)

        //     );
        //     Job j26 = new Job(
        //             "Umetnost",
        //             "Audio i video tehnicar",
        //             Long.valueOf(26)

        //     );
        //     Job j27 = new Job(
        //             "Umetnost",
        //             "Koreograf",
        //             Long.valueOf(27)

        //     );
        //     Job j28 = new Job(
        //             "Umetnost",
        //             "Graficki dizajner",
        //             Long.valueOf(28)

        //     );
        //     Job j29 = new Job(
        //             "Umetnost",
        //             "Graficki dizajner",
        //             Long.valueOf(29)

        //     );
        //     Job j30 = new Job(
        //             "Ugostiteljstvo",
        //             "Pekar",
        //             Long.valueOf(30)

        //     );
        //     Job j31 = new Job(
        //             "Ugostiteljstvo",
        //             "Konobar",
        //             Long.valueOf(31)

        //     );
        //     Job j32 = new Job(
        //             "Ugostiteljstvo",
        //             "Barista",
        //             Long.valueOf(32)

        //     );

        //     Job j33 = new Job(
        //             "Ugostiteljstvo",
        //             "Kuvar",
        //             Long.valueOf(33)

        //     );

        //     Job j34 = new Job(
        //             "Nauka i tehnologija",
        //             "Istoricar",
        //             Long.valueOf(34)

        //     );
        //     Job j35 = new Job(
        //             "Nauka i tehnologija",
        //             "Matematicar",
        //             Long.valueOf(35)

        //     );
        //     Job j36 = new Job(
        //             "Nauka i tehnologija",
        //             "Pomorski inzenjeri",
        //             Long.valueOf(36)

        //     );
        //     Job j37 = new Job(
        //             "Transport",
        //             "Vozac taksija",
        //             Long.valueOf(37)

        //     );
        //     Job j38 = new Job(
        //             "Transport",
        //             "Privatni vozac",
        //             Long.valueOf(38)

        //     );
        //     Job j39 = new Job(
        //             "Transport",
        //             "Vozac autobusa",
        //             Long.valueOf(39)

        //     );
        //     Job j40 = new Job(
        //             "Dostava",
        //             "Dostava brze hrane",
        //             Long.valueOf(40)

        //     );
        //     Job j41 = new Job(
        //             "Trgovina",
        //             "Kasirka",
        //             Long.valueOf(41)

        //     );
        //     Job j42 = new Job(
        //             "Trgovina",
        //             "Menadzer prodavnice",
        //             Long.valueOf(42)

        //     );
        //     Job j43 = new Job(
        //             "Trgovina",
        //             "Prodavac",
        //             Long.valueOf(43)

        //     );
        //     Job j44 = new Job(
        //             "IT",
        //             "C++ programer",
        //             Long.valueOf(44)

        //     );
        //     Job j45 = new Job(
        //             "IT",
        //             "Java programer",
        //             Long.valueOf(45)

        //     );
        //     Job j46 = new Job(
        //             "Ugostiteljstvo",
        //             "Obezbedjenje",
        //             Long.valueOf(46)

        //     );
        //     Job j47 = new Job(
        //             "Transport",
        //             "Vozac sanitetskog vozila",
        //             Long.valueOf(47)

        //     );
        //     Job j48 = new Job(
        //             "Nauka i tehnologija",
        //             "Fizicar",
        //             Long.valueOf(48)

        //     );
        //     Job j49 = new Job(
        //             "Nauka i tehnologija",
        //             "Hemicar",
        //             Long.valueOf(49)

        //     );
        //     Job j50 = new Job(
        //             "Ugostiteljstvo",
        //             "Cistacica",
        //             Long.valueOf(50)

        //     );
        //     Job j51 = new Job(
        //             "Trgovina",
        //             "Magacioner",
        //             Long.valueOf(51)

        //     );
        //     Job j52 = new Job(
        //             "Edukacija",
        //             "Profesor italijanskog jezika",
        //             Long.valueOf(52)

        //     );
        //     Job j53 = new Job(
        //             "Edukacija",
        //             "Profesor ruskog jezika",
        //             Long.valueOf(53)

        //     );
        //     Job j54 = new Job(
        //             "Edukacija",
        //             "Profesor japanskog jezika",
        //             Long.valueOf(54)

        //     );
        //     Job j55 = new Job(
        //             "Dostava",
        //             "Dostava poste",
        //             Long.valueOf(55)

        //     );
        //     Job j56 = new Job(
        //             "Transport",
        //             "Menadzer transporta",
        //             Long.valueOf(56)

        //     );
        //     Job j57 = new Job(
        //             "Transport",
        //             "Dispecer",
        //             Long.valueOf(57)

        //     );

        //     List<Job> list4 = new ArrayList<Job>();
        //     list4.add(j1);
        //     list4.add(j2);
        //     list4.add(j3);
        //     list4.add(j4);
        //     list4.add(j5);
        //     list4.add(j6);
        //     list4.add(j7);
        //     list4.add(j8);
        //     list4.add(j9);
        //     list4.add(j10);
        //     list4.add(j11);
        //     list4.add(j12);
        //     list4.add(j13);
        //     list4.add(j14);
        //     list4.add(j15);
        //     list4.add(j16);
        //     list4.add(j17);
        //     list4.add(j18);
        //     list4.add(j19);
        //     list4.add(j20);
        //     list4.add(j21);
        //     list4.add(j22);
        //     list4.add(j23);
        //     list4.add(j24);
        //     list4.add(j25);
        //     list4.add(j26);
        //     list4.add(j27);
        //     list4.add(j28);
        //     list4.add(j29);
        //     list4.add(j30);
        //     list4.add(j31);
        //     list4.add(j32);
        //     list4.add(j33);
        //     list4.add(j34);
        //     list4.add(j35);
        //     list4.add(j36);
        //     list4.add(j37);
        //     list4.add(j38);
        //     list4.add(j39);
        //     list4.add(j40);
        //     list4.add(j41);
        //     list4.add(j42);
        //     list4.add(j43);
        //     list4.add(j44);
        //     list4.add(j45);
        //     list4.add(j46);
        //     list4.add(j47);
        //     list4.add(j48);
        //     list4.add(j49);
        //     list4.add(j50);
        //     list4.add(j51);
        //     list4.add(j52);
        //     list4.add(j53);
        //     list4.add(j54);
        //     list4.add(j55);
        //     list4.add(j56);
        //     list4.add(j57);
        //     jobRepository.saveAll(list4);

        };
    }
}
