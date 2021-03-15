package com.ideapoke.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideapoke.example.model.Company;
import com.ideapoke.example.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository repository;
	
	public List<Company> listAll() {
		return repository.findAll();
	}
	
	public List<Company> listUsingKeyword(String keyword) {
		return repository.search(keyword);
	}
}
