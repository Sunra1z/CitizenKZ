package com.syrnikter.CitizenKZ.controllers;

import com.syrnikter.CitizenKZ.models.kzcitizen;
import com.syrnikter.CitizenKZ.repositories.CitizenRepos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

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
    @GetMapping("/citizen/{id}")
    public String details(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("data",citizenRepos.getReferenceById(id));
        return "citizen-info.html";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about-us.html";
    }
    @PostMapping("/create")
    public RedirectView saveCitizen(kzcitizen kzcitizen,
     @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        kzcitizen.setPhotos(fileName);
        kzcitizen savedcitizen = citizenRepos.save(kzcitizen);
        String uploadDir = "user-photos/" + savedcitizen.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return new RedirectView("/create", true);
    }
}
