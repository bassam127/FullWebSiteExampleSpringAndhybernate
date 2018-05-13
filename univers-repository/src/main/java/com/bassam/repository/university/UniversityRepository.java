package com.bassam.repository.university;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bassam.model.entiti.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {

	@Query("select u from University u order by u.universityName")
	List<University> getAllUniversity();

	@Query("select count(s) from Student s where s.university.id =:universityId")
	Integer getNumberOfStudents(@Param("universityId") Integer universityId);
}
