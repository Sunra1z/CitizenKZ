package com.syrnikter.CitizenKZ.controllers;

import com.syrnikter.CitizenKZ.models.kzcitizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import com.syrnikter.CitizenKZ.services.CitizenService;

@Controller
public class SearchController {
@Autowired
private CitizenService service;
    @RequestMapping("/search")
    public String find(kzcitizen kzcitizen, Model model, String keyword){
        if(keyword!=null) {
            List<kzcitizen> list = service.getByKeyword(keyword);
            model.addAttribute("list", list);
        }else {
            List<kzcitizen> list = service.getAllCitizens();
            model.addAttribute("list", list); }
        return "search.html";
    }
}
