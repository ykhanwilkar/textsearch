package com.ideapoke.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "company")
//@Table(name = "company")
public class Company {
	@Id
	@Column(name = "id")
	Integer id;
	@Column(name = "name")
	String name;
	@Column(name = "website")
	String website;
	@Column(name = "address")
	String address;
	@Column(name = "country")
	String country;
	@Column(name = "currentemployee")
	Integer currentEmployee;
	@Column(name = "description")
	String description;
	@Column(name = "domain")
	String domain;
	@Column(name = "foundedyear")
	String foundedyear;
	@Column(name = "industry")
	String industry;
	@Column(name = "logourl")
	String logourl;
	@Column(name = "totalemployee")
	String totalEmployee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getCurrentEmployee() {
		return currentEmployee;
	}

	public void setCurrentEmployee(Integer currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFoundedYear() {
		return foundedyear;
	}

	public void setFoundedYear(String foundedYear) {
		this.foundedyear = foundedYear;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	public String getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(String totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

}
