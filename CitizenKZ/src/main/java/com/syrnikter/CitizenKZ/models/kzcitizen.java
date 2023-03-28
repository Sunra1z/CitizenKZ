package com.syrnikter.CitizenKZ.models;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="citizen_info")
@NoArgsConstructor
@Getter
@Setter
public class kzcitizen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String otchestvo;
    private String sex;

    private String give_place;
    private String birth_place;
    private String iin;
    private String doc_number;
    private String birth_date;
    private String give_date;
    @Column(nullable = true, length = 64)
    private String photos;

    public kzcitizen(String name, String surname, String birth_place, String birth_date, String doc_number, String iin,
                     String otchestvo, String give_date, String give_place, String sex, String photos){
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
        this.photos = photos;
    }
    @Transient
    public String getPhotosImagePath(){
        if (photos == null || id == null) return null;

        return "/user-photos/" + id + "/" + photos;
    }
}
