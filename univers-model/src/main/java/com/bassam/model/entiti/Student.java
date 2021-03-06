package com.bassam.model.entiti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;

	@NotNull(message = "you have to specify first name")
	@Column(name = "First_Name")
	private String firstName;

	@NotNull(message = "you have to specify last name")
	@Column(name = "Last_Name")
	private String lastName;

	@NotNull(message = "you have to age")
	@Min(value = 0, message = "minimum value is zero")
	@Max(value = 100, message = "max value is 100")
	@Column(name = "Age")
	private Integer age;

	@NotNull(message = "gender must be set")
	@Column(name = "Gender")
	private String gender;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "university_id")
	private University university;

	public Student() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return firstName + lastName + age + gender;
	}

}
