package com.example.teacher.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.example.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "TF")
public class TF {

    @Id
    @Column(name = "tfid", unique = true)
    private Integer tfid;
    @Column(name = ("id"), unique = false)
    private Integer id;
    @Column(name = ("fid"), unique = false)
    private Integer fid;

    public TF() {
    }

    public TF(Integer tfid, Integer id, Integer fid) {
        this.tfid = tfid;
        this.id = id;
        this.fid = fid;
    }

    public Integer getTfid() {
        return tfid;
    }

    public void setTfid(Integer tfid) {
        this.tfid = tfid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
}
