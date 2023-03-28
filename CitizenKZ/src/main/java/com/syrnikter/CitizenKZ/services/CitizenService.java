package com.syrnikter.CitizenKZ.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syrnikter.CitizenKZ.models.kzcitizen;
import com.syrnikter.CitizenKZ.repositories.CitizenRepos;

@Service
public class CitizenService {
    @Autowired
    private CitizenRepos repository;
    /*
    * Список всех
     */
    public List<kzcitizen> getAllCitizens(){
        List<kzcitizen> list = (List<kzcitizen>) repository.findAll();
        return list;
    }
    /*
    * Поиск
     */
    public List<kzcitizen> getByKeyword(String keyword){
        return repository.findByKeyword(keyword);
    }
}
