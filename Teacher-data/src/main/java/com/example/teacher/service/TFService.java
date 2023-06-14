package com.example.teacher.service;

import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.TFRepo;
import com.example.teacher.repository.TeacherRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class TFService {
    private final TFRepo tf;

    public TFService(TFRepo tf) {
        this.tf = tf;
    }




}
