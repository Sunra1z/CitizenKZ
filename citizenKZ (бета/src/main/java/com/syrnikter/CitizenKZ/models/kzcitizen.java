package com.syrnikter.CitizenKZ.models;

import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Table(name="citizen_info")
@NoArgsConstructor
public class kzcitizen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getName() {
        return name;
    }

    public void setNames(String name) {
        this.name = name;
    }

    private String name;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    private String otchestvo;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String sex;

    public String getGive_place() {
        return give_place;
    }

    public void setGivePlace(String give_place) {
        this.give_place = give_place;
    }

    private String give_place;

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    private String birth_place;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    private String iin;

    public String getDoc_number() {
        return doc_number;
    }

    public void setDoc_number(String doc_number) {
        this.doc_number = doc_number;
    }

    private String doc_number;

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    private String birth_date;

    public String getGive_date() {
        return give_date;
    }

    public void setGive_date(String give_Date) {
        this.give_date = give_date;
    }

    private String give_date;

    public kzcitizen(String name, String surname, String birth_place, String birth_date, String doc_number, String iin,
                     String otchestvo, String give_date, String give_place, String sex){
        this.iin = iin;
        this.otchestvo = otchestvo;
        this.give_date = give_date;
        this.birth_date = birth_date;
        this.birth_place = birth_place;
        this.doc_number = doc_number;
        this.give_place = give_place;
        this.name = name;
        this.sex = sex;
        this.surname = surname;
    }
}
