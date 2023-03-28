package com.syrnikter.CitizenKZ.controllers;

import com.syrnikter.CitizenKZ.models.kzcitizen;
import com.syrnikter.CitizenKZ.repositories.CitizenRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MainController {

    private CitizenRepos citizenRepos;

    @Autowired
    public MainController(CitizenRepos citizenRepos){
        this.citizenRepos = citizenRepos;
    }

    @GetMapping("/")
    public String title(Model model) {
        return "mainpage.html";
    }
    @GetMapping("/create")
    public String create(Model model){
        return "createCitizen.html";
    }
    @GetMapping("/search")
    public String search(Model model){
        return "citizen-info.html";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about-us.html";
    }
    @PostMapping("/create")
    public String citizenAdd(@RequestParam String surname, @RequestParam String name, @RequestParam String otchestvo,
                             @RequestParam String sex, @RequestParam String birth_place, @RequestParam String give_place,
                             @RequestParam String birth_date, @RequestParam String iin, @RequestParam String doc_number,
                             @RequestParam String give_date){
        kzcitizen kzcitizen = new kzcitizen(name,surname,birth_place,birth_date,doc_number,iin,otchestvo,give_date,give_place,sex);
        citizenRepos.save(kzcitizen);
        return "redirect:/";
    }
}
