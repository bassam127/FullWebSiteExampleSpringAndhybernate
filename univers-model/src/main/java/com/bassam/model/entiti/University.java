package com.bassam.model.entiti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "UNIVERSITY")
public class University {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;
	@Column(name = "UNIVERSITY_NAME")
	@NotNull(message = "not allow to be null")
	private String universityName;
	@Column(name = "UNIVERSITY_COUNTRY")
	@NotNull(message = "not allow to be null")
	private String universityCountry;
	@Column(name = "UNIVERSITY_CITY")
	@NotNull(message = "not allow to be null")
	private String universityCity;


	public University(){

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityCountry() {
		return universityCountry;
	}
	public void setUniversityCountry(String universityCountry) {
		this.universityCountry = universityCountry;
	}
	public String getUniversityCity() {
		return universityCity;
	}
	public void setUniversityCity(String universityCity) {
		this.universityCity = universityCity;
	}

	@Override
	public String toString() {
		return universityName + universityCountry + universityCity; 
	}
}
