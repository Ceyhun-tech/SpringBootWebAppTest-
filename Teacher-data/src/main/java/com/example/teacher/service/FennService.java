package com.example.teacher.service;

import com.example.teacher.repository.FennRepo;
import com.example.teacher.repository.TeacherRepository;

public class FennService {
    private final FennRepo fennRepo;

    public FennService(FennRepo fennRepo) {

        this.fennRepo = fennRepo;
    }

}
