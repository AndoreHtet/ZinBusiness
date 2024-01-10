package com.example.zinbusinesswebsite.dao;

import com.example.zinbusinesswebsite.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company,Integer> {
}
