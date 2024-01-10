package com.example.zinbusinesswebsite.dao;

import com.example.zinbusinesswebsite.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDao extends JpaRepository<Service,Integer> {
}
