package com.ideapoke.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ideapoke.example.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
	//@Query("SELECT p FROM COMPANY p WHERE CONCAT(p.name, p.website, p.address,  p.country, p.description, p.domain, p.foundedyear, p.industry) LIKE %?1%")
	@Query("SELECT p FROM company p WHERE p.name LIKE %:keyword%"
            + " OR p.website LIKE %:keyword%"
            + " OR p.address LIKE %:keyword%"
            + " OR p.country LIKE %:keyword%"
            + " OR p.description LIKE %:keyword%"
            + " OR p.domain LIKE %:keyword%"
            + " OR p.foundedyear LIKE %:keyword%"
            + " OR p.country LIKE %:keyword%"
            + " OR p.industry LIKE %:keyword%")
	public List<Company> search(String keyword);
}
