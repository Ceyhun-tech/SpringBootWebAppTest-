package com.example.teacher.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "Fenn")
public class Fenn {
    @Id
    @Column(name = "fid")

    private Integer fid;

    @Column(name = "fad")
    private String fad;

    @Column(name = "fms")
    private Integer fms;

    @ManyToMany(mappedBy = "fennList")
    List <Teacher> teacherList;

    public Fenn() {
    }

    public Fenn(Integer fid, String fad, Integer fms) {
        this.fid = fid;
        this.fad = fad;
        this.fms = fms;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFad() {
        return fad;
    }

    public void setFad(String fad) {
        this.fad = fad;
    }

    public Integer getFms() {
        return fms;
    }

    public void setFms(Integer fms) {
        this.fms = fms;
    }
}
