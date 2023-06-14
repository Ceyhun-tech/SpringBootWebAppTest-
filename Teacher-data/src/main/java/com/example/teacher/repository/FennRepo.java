package com.example.teacher.repository;

import com.example.teacher.entity.Fenn;
import com.example.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FennRepo extends JpaRepository<Fenn, Integer> {

}
