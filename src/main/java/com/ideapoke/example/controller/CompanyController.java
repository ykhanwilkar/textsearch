package com.ideapoke.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideapoke.example.model.Company;
import com.ideapoke.example.service.CompanyService;

@Controller
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/list")
	public List<Company> listAll() {
		return service.listAll();
	}
	
	@GetMapping("/list/{keyword}")
	public List<Company> getList(@PathVariable String keyword) {
		return service.listUsingKeyword(keyword);
	}
}
