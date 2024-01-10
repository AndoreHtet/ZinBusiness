package com.example.zinbusinesswebsite.dao;

import com.example.zinbusinesswebsite.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesDao extends JpaRepository<Courses,Integer> {
}
