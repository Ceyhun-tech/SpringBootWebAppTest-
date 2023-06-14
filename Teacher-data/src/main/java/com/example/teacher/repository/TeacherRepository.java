package com.example.teacher.repository;
import com.example.teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository <Teacher, Integer> {
List<Teacher> findByAd(String ad);



}
