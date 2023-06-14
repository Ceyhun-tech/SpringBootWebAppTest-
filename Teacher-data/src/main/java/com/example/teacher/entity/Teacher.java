package com.example.teacher.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "Teacherr")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    private Integer id;

    @Column(name = "Ad")
    private String ad;

    @Column(name = "Soyad")
    private String soyad;

    @ManyToMany
    @JoinTable(name = "TF",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "fid"))
    List <Fenn> fennList;

    public List<Fenn> getFennList() {
        return fennList;
    }

    public void setFennList(List<Fenn> fennList) {
        this.fennList = fennList;
    }

    public Teacher() {
        super();
    }

    public Teacher(Integer id, String ad, String soyad) {
        super();
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}
