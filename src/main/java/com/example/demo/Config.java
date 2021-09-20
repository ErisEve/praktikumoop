package com.example.demo;

import com.example.demo.administrator.Administrator;
import com.example.demo.administrator.AdministratorRepository;
import com.example.demo.ads.Ad;
import com.example.demo.ads.AdRepository;
import com.example.demo.applications.Application;
import com.example.demo.applications.ApplicationRepository;
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
    CommandLineRunner commandLineRunner(EmployerRepository employerRepository, CandidateRepository candidateRepository, AdRepository adRepository, AdministratorRepository administratorRepository, ApplicationRepository applicationRepository){
        return args -> {
                Employer emp3 = new Employer(
                    "Two Desperados",
                    "Bg",
                    "IT",
                    "0114203789",
                    "contact@twodesperados.com",
                    "11000",
                    "Srbija",
                    "Bulevar vojvode Bojovica",
                    "35547",
                    "twodesperados",
                    "twod222",
                    true,
                    "tow/dep/hsgkg.com"
            );
            Employer emp4 = new Employer(
                    "ZWEBB Srbija",
                    "Kv",
                    "IT",
                    "0695007172",
                    "info@zwebb.com",
                    "36000",
                    "Srbija",
                    "IV kraljevacki bataljon",
                    "35548",
                    "zwebbsrbija",
                    "zwebb123",
                    true,
                    "zwebb/srbija/hsgkg.com"
            );
            Employer emp5 = new Employer(
                    "Comtrade Solution Engineering",
                    "Kg",
                    "IT",
                    "034308927",
                    "praksa@comtrade.com",
                    "36000",
                    "Srbija",
                    "Srete Mladenovica",
                    "35549",
                    "comtrade",
                    "comtrade123",
                    true,
                    "comtrade/srbija/hsgkg.com"
            );
            Employer emp6 = new Employer(
                    "KFC restorani",
                    "Ni",
                    "Ugostiteljstvo",
                    "0648730026",
                    "info-rs@amrest.eu",
                    "18000",
                    "Srbija",
                    "Bulevar Nemanjica",
                    "35550",
                    "kfcrestorani",
                    "kfc123",
                    true,
                    "kfc/srbija/hsgkg.com"
            );
            Employer emp7 = new Employer(
                    "Mozzart d.o.o.",
                    "Bg",
                    "Ugostiteljstvo",
                    "062205372",
                    "help@mozzartbet.com",
                    "11000",
                    "Srbija",
                    "Ustanicka",
                    "35551",
                    "mozzart",
                    "mozzart123",
                    true,
                    "mozzart/srbija/hsgkg.com"
            );
            Employer emp8 = new Employer(
                    "Maxi",
                    "Bg",
                    "Trgovina",
                    "0117153400",
                    "office@delhaize.rs",
                    "11000",
                    "Srbija",
                    "Jurija Gagarina",
                    "35552",
                    "maxi",
                    "maxi123",
                    true,
                    "maxi/srbija/hsgkg.com"
            );
            Employer emp9 = new Employer(
                    "Gigatron prodavnica",
                    "Kg",
                    "Trgovina",
                    "034200660",
                    "gigatron.info@neposys.com",
                    "36000",
                    "Srbija",
                    "Karadjordjeva",
                    "35553",
                    "gigatron",
                    "gigatron123",
                    true,
                    "gigatron/srbija/hsgkg.com"
            );
            Employer emp10 = new Employer(
                    "Hotel Zelengora",
                    "Kg",
                    "Ugostiteljstvo",
                    "034336254",
                    "zelengora@sumaricedoo.com",
                    "36000",
                    "Srbija",
                    "Branka Radicevica",
                    "35554",
                    "hotelzelengora",
                    "zelengora123",
                    true,
                    "zelengora/srbija/hsgkg.com"
            );
            Employer emp11 = new Employer(
                    "Ikea",
                    "Bg",
                    "Trgovina",
                    "0117555444",
                    "info@ikeabeograd.com",
                    "11000",
                    "Srbija",
                    "Astrid Lindgren",
                    "35555",
                    "ikeabg",
                    "ikea123",
                    true,
                    "ikea/srbija/hsgkg.com"
            );
            Employer emp12 = new Employer(
                    "Idea",
                    "Kg",
                    "Trgovina",
                    "034123123",
                    "online@idea.rs",
                    "36000",
                    "Srbija",
                    "Bulevar kraljice Marija",
                    "35556",
                    "ieakg",
                    "idea123",
                    true,
                    "idea/plaza/hsgkg.com"
            );
            Employer emp13 = new Employer(
                    "WinWin",
                    "Kg",
                    "Trgovina",
                    "034999666",
                    "info@winwinkg.com",
                    "36000",
                    "Srbija",
                    "Cara Lazara",
                    "35557",
                    "winwin",
                    "winwin123",
                    true,
                    "winwin/kg/hsgkg.com"
            );
            Employer emp14 = new Employer(
                    "Zara",
                    "Bg",
                    "Trgovina",
                    "0112627722",
                    "info@zarabg.com",
                    "11000",
                    "Srbija",
                    "Kneza Mihajla",
                    "35558",
                    "zarabg",
                    "zara123",
                    true,
                    "zara/srbija/hsgkg.com"
            );
            Employer emp15 = new Employer(
                    "McDonald's",
                    "Bg",
                    "Ugostiteljstvo",
                    "0113120991",
                    "info@mcdonaldsbg.com",
                    "11000",
                    "Srbija",
                    "Bulevar Mihajla Pupina",
                    "35559",
                    "mcdonaldsbg",
                    "mcdonalds123",
                    true,
                    "mcdonalds/bg/hsgkg.com"
            );
            Employer emp16 = new Employer(
                    "Privredno društvo Gobutler Deliveries",
                    "Bg",
                    "Dostava",
                    "0117555322",
                    "info@gobutlerbg.com",
                    "11000",
                    "Srbija",
                    "Savski venac",
                    "35540",
                    "gobutlerbg",
                    "gobutler123",
                    true,
                    "gobutler/srbbg/hsgkg.com"
            );
            Employer emp17 = new Employer(
                    "cargo partner",
                    "Bg",
                    "Transport",
                    "011755345",
                    "info@cargobg.com",
                    "11000",
                    "Srbija",
                    "Savski venac",
                    "35541",
                    "cargobg",
                    "cargo123",
                    true,
                    "cargo/bg/hsgkg.com"
            );
            Employer emp18 = new Employer(
                    "Keba",
                    "NS",
                    "IT",
                    "011611144",
                    "info@kebans.com",
                    "21000",
                    "Srbija",
                    "Bulevar Oslobodjenja",
                    "35542",
                    "kebabg",
                    "keba123",
                    true,
                    "keba/novisad/hsgkg.com"
            );
            Employer emp19 = new Employer(
                    "Ubisoft",
                    "Bg",
                    "IT",
                    "011732121",
                    "info@ubisoftbg.com",
                    "11000",
                    "Srbija",
                    "Visnjacka",
                    "35543",
                    "ubisoftbg",
                    "ubisoft123",
                    true,
                    "ubisoft/bg/hsgkg.com"
            );
            Employer emp20 = new Employer(
                    "Zelengora",
                    "Kg",
                    "Ugostiteljstvo",
                    "034336254",
                    "info@zelengorakg.com",
                    "36000",
                    "Srbija",
                    "Lole Ribara",
                    "35545",
                    "zelengorabg",
                    "zelengora123",
                    true,
                    "zelengora/kg/hsgkg.com"
            );

            List<Employer> list = new ArrayList<Employer>();
            list.add(emp3);
            list.add(emp4);
            list.add(emp5);
            list.add(emp6);
            list.add(emp7);
            list.add(emp8);
            list.add(emp9);
            list.add(emp10);
            list.add(emp11);
            list.add(emp12);
            list.add(emp13);
            list.add(emp14);
            list.add(emp15);
            list.add(emp16);
            list.add(emp17);
            list.add(emp18);
            list.add(emp19);
            list.add(emp20);


            employerRepository.saveAll(list);



            Candidate cust1 = new Candidate(
                    "Mina",
                    "Nikolic",
                    "2000-01-12",
                    "nkolidmina@gmail.com",
                    "Cegarska",
                    "erisevergreen",
                    "codeeris",
                    true,
                    "0603709222",
                    "2 years"
            );
            Candidate cust2 = new Candidate(
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
            Candidate cust3 = new Candidate(
                    "Katarina",
                    "Rakovic",
                    "1999-02-08",
                    "kaca1478@gmail.com",
                    "Milovana Glisica",
                    "kaca1478",
                    "kacar1478",
                    true,
                    "0601122334",
                    "4 years"
            );Candidate cust4 = new Candidate(
                    "Tamara",
                    "Jerinic",
                    "2000-01-01",
                    "tamara1@gmail.com",
                    "Glavna ulica",
                    "tamara1",
                    "tamaraj123",
                    true,
                    "0601122335",
                    "5 years"
            );Candidate cust5 = new Candidate(
                    "Andjela",
                    "Kidisevic",
                    "2000-03-02",
                    "andjelak3@gmail.com",
                    "Glavna ulica",
                    "kidisevic12",
                    "kidisevica555",
                    true,
                    "0661112225",
                    "3 years"
            );
            Candidate cust6 = new Candidate(
                    "Milica",
                    "Abramovic",
                    "1991-06-12",
                    "milicaabramovic@gmail.com",
                    "Jovice Bezuljevica",
                    "milicaabramovic",
                    "milicaa123",
                    true,
                    "013351741",
                    "8 years"
            );
            Candidate cust7 = new Candidate(
                    "Nikola",
                    "Cvetic",
                    "1983-23-10",
                    "cveticn@gmail.com",
                    "Zadrugarska",
                    "cveticnikola",
                    "cvetic123",
                    true,
                    "0623369543",
                    "10 years"
            );
            Candidate cust8 = new Candidate(
                    "Srdjan",
                    "Blagojevic",
                    "1990-18-02",
                    "blagojevicsrdjan@gmail.com",
                    "Pionirska",
                    "srki666",
                    "blagojevic123",
                    true,
                    "0633344522",
                    "5 years"
            );
            Candidate cust9 = new Candidate(
                    "Matija",
                    "Lukovic",
                    "1996-02-07",
                    "lukovicmatija@gmail.com",
                    "Bulevac kraljice Marije",
                    "lukovic3",
                    "matija123",
                    true,
                    "0653483763",
                    "5 years"
            );
            Candidate cust10 = new Candidate(
                    "Teodora",
                    "Pavlovic",
                    "1997-23-07",
                    "tiki3@gmail.com",
                    "Lepenicki bulevar",
                    "tikipavlovic",
                    "teodora123",
                    true,
                    "0623886101",
                    "7 years"
            );
            Candidate cust11 = new Candidate(
                    "Nikolija",
                    "Stevanovic",
                    "1999-01-01",
                    "nikolijas@gmail.com",
                    "Neznanog junaka",
                    "nikolija7",
                    "nikolija123",
                    true,
                    "0633485490",
                    "3 years"
            );
            Candidate cust12 = new Candidate(
                    "Ana",
                    "Bojcic",
                    "1996-15-06",
                    "anabojcic@gmail.com",
                    "Jugoslovenska",
                    "anabojcic77",
                    "ana777",
                    false,
                    "0623160819",
                    "7 years"
            );
            Candidate cust13 = new Candidate(
                    "Stefan",
                    "Brkic",
                    "1974-09-12",
                    "stefke@gmail.com",
                    "Hajduk Veljkova",
                    "stefke777",
                    "stefan123",
                    false,
                    "0626330479",
                    "15 years"
            );
            Candidate cust14 = new Candidate(
                    "Ivana",
                    "Mijatovic",
                    "1989-14-04",
                    "ivana3@gmail.com",
                    "Kragujevackog bataljona",
                    "ivana777",
                    "ivana123",
                    true,
                    "0633485999",
                    "17 years"
            );
            Candidate cust15 = new Candidate(
                    "Bojan",
                    "Bimbasic",
                    "1979-11-04",
                    "bojanbimbasic@gmail.com",
                    "Jevrema Obrenovica",
                    "bojan999",
                    "bojan123",
                    true,
                    "0631237999",
                    "16 years"
            );
            Candidate cust16 = new Candidate(
                    "Jovan",
                    "Arsic",
                    "1992-20-08",
                    "arsic3@gmail.com",
                    "Nikceviceva",
                    "jovan2008",
                    "jovan123",
                    true,
                    "0612726172",
                    "5 years"
            );
            Candidate cust17 = new Candidate(
                    "Strahinja",
                    "Avramovic",
                    "1991-01-06",
                    "strahinja91@gmail.com",
                    "Ive Andrica",
                    "strale91",
                    "strahinja123",
                    false,
                    "0628200811",
                    "3 years"
            );
            Candidate cust18 = new Candidate(
                    "Milan",
                    "Alempijevic",
                    "1997-04-06",
                    "milan96@gmail.com",
                    "Slavke Djurdjevic",
                    "milan96",
                    "milan123",
                    true,
                    "0612407332",
                    "5 years"
            );
            Candidate cust19 = new Candidate(
                    "Miroslav",
                    "Antic",
                    "1994-09-03",
                    "miroslav94@gmail.com",
                    "Boska Djurcica",
                    "miroslav94",
                    "miroslav123",
                    true,
                    "0615485799",
                    "3 years"
            );
            Candidate cust20 = new Candidate(
                    "Sofija",
                    "Blagojcic",
                    "1999-19-06",
                    "sofija99@gmail.com",
                    "Liparska",
                    "sofija99",
                    "sofija123",
                    true,
                    "0612414956",
                    "1 year"
            );
            Candidate cust21 = new Candidate(
                    "Isidora",
                    "Belojevic",
                    "2000-10-01",
                    "belojevic00@gmail.com",
                    "kralja Aleksandra I Karadjordjevica",
                    "isidora00",
                    "isisdora123",
                    true,
                    "0612414951",
                    "2 years"
            );
            Candidate cust22 = new Candidate(
                    "Dusan",
                    "Jovanovic",
                    "2001-05-05",
                    "dusan01@gmail.com",
                    "Jovanke Orleanke",
                    "dusan01",
                    "dusan123",
                    true,
                    "0612414977",
                    "1 year"
            );
            Candidate cust23 = new Candidate(
                    "Sara",
                    "Andjelic",
                    "1998-27-06",
                    "sara98@gmail.com",
                    "Ljube Vuckovica",
                    "sara98",
                    "sara123",
                    true,
                    "0612333956",
                    "3 years"
            );
            Candidate cust24 = new Candidate(
                    "Dusanka",
                    "Babic",
                    "2001-03-08",
                    "dusanka01@gmail.com",
                    "Dr Ilije Kolovica",
                    "dusanka01",
                    "dusanka123",
                    true,
                    "0613114956",
                    "1 year"
            );
            Candidate cust25 = new Candidate(
                    "Petar",
                    "Bojovic",
                    "1999-08-11",
                    "petar99@gmail.com",
                    "Nemanjina",
                    "petar99",
                    "petar123",
                    true,
                    "0642314956",
                    "3 years"
            );
            Candidate cust26 = new Candidate(
                    "Avram",
                    "Stojkovic",
                    "1989-10-12",
                    "avram89@gmail.com",
                    "Dusana Bokana",
                    "avram89",
                    "avram123",
                    false,
                    "0621164956",
                    "7 years"
            );
            Candidate cust27 = new Candidate(
                    "Andjelko",
                    "Rakic",
                    "1990-02-07",
                    "andjelko90@gmail.com",
                    "Brace Petkovica",
                    "andjelko90",
                    "andjelko123",
                    false,
                    "062397365",
                    "5 years"
            );
            Candidate cust28 = new Candidate(
                    "Jasna",
                    "Grujicic",
                    "1992-23-07",
                    "jasna92@gmail.com",
                    "Sretenjskog Ustava",
                    "jasna92",
                    "jasna123",
                    true,
                    "0656101186",
                    "3 years"
            );
            Candidate cust29 = new Candidate(
                    "Jovana",
                    "Miletic",
                    "1994-09-12",
                    "jovana94@gmail.com",
                    "Nikole Pasica",
                    "jovana94",
                    "jovana123",
                    true,
                    "0626713956",
                    "4 years"
            );
            Candidate cust30 = new Candidate(
                    "Jelisaveta",
                    "Milunovic",
                    "1999-09-05",
                    "jelisaveta99@gmail.com",
                    "Atinska",
                    "jelisaveta99",
                    "jelisaveta123",
                    true,
                    "0612314998",
                    "1 year"
            );




            List<Candidate> list1 = new ArrayList<Candidate>();
            list1.add(cust1);
            list1.add(cust2);
            list1.add(cust3);
            list1.add(cust4);
            list1.add(cust5);
            list1.add(cust6);
            list1.add(cust7);
            list1.add(cust8);
            list1.add(cust9);
            list1.add(cust10);
            list1.add(cust11);
            list1.add(cust12);
            list1.add(cust13);
            list1.add(cust14);
            list1.add(cust15);
            list1.add(cust16);
            list1.add(cust17);
            list1.add(cust18);
            list1.add(cust19);
            list1.add(cust20);
            list1.add(cust21);
            list1.add(cust22);
            list1.add(cust23);
            list1.add(cust24);
            list1.add(cust25);
            list1.add(cust26);
            list1.add(cust27);
            list1.add(cust28);
            list1.add(cust29);
            list1.add(cust30);

            candidateRepository.saveAll(list1);


            Ad ad1 = new Ad(

                    "Prilika da izgradite priznatu karijeru kao i mogucnost brzog napredovanja u porodicnoj atmosferi. Od Vas ce se ocekivati da vodite i motivisete svoj tim, posedujete visoke organizacione sposobnost kao i sposobnost donosenja odluka i resavanja problema.",

                    "25.03.2022",

                    false,

                    0,

                    0,

                    "Menadzer prodavnice",

                    1L
            );
            Ad ad2 = new Ad(
                    "Od Vas ce se ocekivati da se fokusirate na zadovoljstvo kupaca, vodiste pozitivnu i otvorenu komunikaciju, posedujete visoke organizacione sposobnosti i disciplinu kao i sposobnost donosenja odluka i resavanja problema.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "30.03.2022",
                    false,
                    0,
                    0,
                    "Menadzer prodavnice",
                    2L
            );
            Ad ad3 = new Ad(
                    "Ako te zanima gejming industrija i ako si u raspoloženju da probaš nešto drugačije, predstavljamo ti Game Jam! Beogradski gejming studio Two Desperados traži praktikante iz oblasti softverskog inženjerstva koji žele da nauče više o procesu razvoja igara.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "15.02.2022",
                    false,
                    0,
                    0,
                    "Informaciona bezbednost",
                    3L
            );
            Ad ad4 = new Ad(
                    "Traze se kandidati koji imaju praktična iskustva iz PHP programiranja i frontend razvoja, zele da napreduju i naprave prvi korak ka uspešnoj karijeri. Nudimo odlične uslove rada, mogućnost korišćenja najsavremenijih alata i tehnologija i rad sa mentorima.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "22.07.2022",
                    false,
                    0,
                    0,
                    "CRM software",
                    4L
            );
            Ad ad5 = new Ad(
                    "Projektovanje, razvoj i implementacija kompletnih sistema u oblasti IT tehnologija. Potrebna znanja: Poznavanje rada u bar jednom OOP jeziku, poznavanje rada u SQL, osnovna znanja o bazama podataka, poznavanje osnovnih koncepata UML-a.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "12.01.2022",
                    true,
                    0,
                    0,
                    "Administrator baza",
                    5L
            );
            Ad ad6 = new Ad(
                    "Potrebne su izrazene komunikacijske vestine, preciznost i tacnost u radu, timska orijentisanost, minimum IV stepen strucne spreme. Od zaposlenog se zahteva: Uplata/isplata tiketa, prodaja pica i maloprodaja, pruzanje informacija o uslugama korisnicima.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "11.12.2021",
                    false,
                    0,
                    0,
                    "Konobar",
                    6L
            );
            Ad ad7 = new Ad(
                    "You'll be assisting your team in handling communication with multiple departments, removing any obstacles, helping them identify road blockers and managing them. Setting personal goals for each of your team members and helping them grow technically.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "23.03.2022",
                    true,
                    0,
                    0,
                    "C++ programer",
                    7L
            );
            Ad ad8 = new Ad(
                    "Opis posla: rad u toplom delu kuhinje, priprema obroka, priprema i poručivanje namirnica. Nudimo: redovnu isplatu, topli obrok i kafu, rad u prijatnoj atmosferi. Poželjno radno iskustvo na istim ili sličnim pozicijama.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "07.11.2021",
                    false,
                    0,
                    0,
                    "Kuvar",
                    8L
            );
            Ad ad9 = new Ad(
                    "Obezbeđujemo Vam rad sa našim vozilima.U ponudi imamo automobile i električne bicikle. Mogućnost rada na procenat ili fiksnu zaradu. Fiksna plata za automobil 40.000. Fiksna plata za električni bicikl 50.000.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "13.12.2021",
                    false,
                    0,
                    0,
                    "Dostava brze hrane",
                    9L
            );
            Ad ad10 = new Ad(
                    "Zaduzenja i odgovornosti: prevodjenje sa srpskog na engleski jezik i sa engleskog na srpski ,raznovrsnih materijala za potrebe kompanije, lektura i korektura, evidencija prevedenog materijala, titlovanje, komunikacija sa eksternim prevodiocima po potrebi.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "01.12.2021",
                    true,
                    0,
                    0,
                    "Profesor engleskog jezika",
                    10L
            );
            Ad ad11 = new Ad(
                    "Pridruzite se timu koji ima buducnost! Nudimo dobru radnu atmosferu, priliku za napredovanje kao i stipendije.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "21.03.2022",
                    false,
                    0,
                    0,
                    "Prodavac",
                    11L
            );
            Ad ad12 = new Ad(
                    "Potrebni uslovi: vozacka dozvola B kategorije, sposobnost za rad u dinamičnom okruženju i u timu, pažljivost i odgovornost u saobraćaju, da se protiv kandidata ne vodi krivični postupak i da nije osuđivan, pozeljno radno iskustvo na slicnim poslovima.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "13.10.2021",
                    false,
                    0,
                    0,
                    "Dostavljac poste",
                    12L
            );
            Ad ad13 = new Ad(
                    "Uslovi: IV stepen stručne spreme, poželjno radno iskustvo, poznavanje grada, znanje stranog jezika, smenski rad.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "07.11.2021",
                    false,
                    0,
                    0,
                    "Dispecer",
                    13L
            );
            Ad ad14 = new Ad(
                    "Uslovi: IV stepen stručne spreme, vozačka dozvola, poznavanje grada, smenski rad, poželjno radno iskustvo.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "20.11.2021",
                    false,
                    0,
                    0,
                    "Vozac taksija",
                    14L
            );
            Ad ad15 = new Ad(
                    "Uslovi: IV stepen stručne spreme, poželjno radno iskustvo, znanje engleskog ili nemačkog jezika - konverzacijski nivo.",
                    //     LocalDate.of(2021, Month.JANUARY,25),
                    "29.11.2021",
                    false,
                    0,
                    0,
                    "Menadzer transporta",
                    15L
            );

            List<Ad> list2 = new ArrayList<Ad>();
            list2.add(ad1);
            list2.add(ad2);
            list2.add(ad3);
            list2.add(ad4);
            list2.add(ad5);
            list2.add(ad6);
            list2.add(ad7);
            list2.add(ad8);
            list2.add(ad9);
            list2.add(ad10);
            list2.add(ad11);
            list2.add(ad12);
            list2.add(ad13);
            list2.add(ad14);
            list2.add(ad15);

            adRepository.saveAll(list2);



            Administrator adm1 = new Administrator(
                    "marinas",
                    "marinas123"
            );
            Administrator adm2 = new Administrator(
                    "dragutino",
                    "dragutino123"
            );
            Administrator adm3 = new Administrator(
                    "anak",
                    "anak123"
            );
            List<Administrator> list3 = new ArrayList<Administrator>();
            list3.add(adm1);
            list3.add(adm2);
            list3.add(adm3);
            List<Administrator> administrators = administratorRepository.saveAll(list3);




            Application app1 = new Application(
                    1L,
                    2L,
                    "Nakon zavrsetka studija, poznata IT kompanija me je primila na mesto junior developera.Ubrzo sam dobio priliku da asistiram i radim na projektima sa iskusnim programerima koji su pohvalili i pozdravili moju fleksibilnost i liderski duh.",
                    "Strucna praksa u kompaniji ComTrade i iskustvo u radu sa Java, C++, Python programima."

            );
            Application app2 = new Application(
                    3L,
                    4L,
                    "Nakon zavrsene srednje skole, bavio sam se volonterskim radom. ",
                    "IV stepen strucne spreme, zavrsena srednja Ekonomska skola."

            );
            Application app3 = new Application(
                    5L,
                    6L,
                    "Tokom visih godina studija sam bila asistent u osnovnoj skoli, gde sam imala priliku da asistiram i radim sa iskusnijim nastavnicima Nemackog jezika.",
                    "Osnovne akademske studije na FILUM-u, Nemacki jezik i knjizevnost."

            );
            Application app4 = new Application(
                    6L,
                    7L,
                    "Pored strucne prakse i volonterskog rada tokom studiranja na Prirodno-matematickom fakultetu, nemam daljeg radnog iskustva.",
                    "Osnovne akademske studije PMF - Hemija."

            );
            Application app5 = new Application(
                    8L,
                    9L,
                    "Nakon zavrsene srednje skole bio sam na strucnoj praksi tokom koje sam stekao iskustvo u radu sa ostalim zaposlenima, radne navike i disciplinu u obavljanju poslova i postovanja hijerarhije.",
                    "IV stepen strucne spreme, zavrsena Tehnicka srednja skola."

            );



            List<Application> list4 = new ArrayList<Application>();
            list4.add(app1);
            list4.add(app2);
            list4.add(app3);
            list4.add(app4);
            list4.add(app5);


            List<Application> applications = applicationRepository.saveAll(list4);
            Administrator adm5 = new Administrator(
                    "carlos123",
                    "carlos123"
            );
            administratorRepository.save(adm5); 
            

        };
    }
}
