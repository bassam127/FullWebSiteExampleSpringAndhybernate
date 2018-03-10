/**
 * 
 */
package com.bassam.service.showallstudents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bassam.model.entiti.Student;
import com.bassam.repository.student.StudentRepository;

/**
 * @author Bassam
 *
 */
@Service
public class ShowAllStudensServicetImpl implements ShowAllStudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudens() {

		return studentRepository.getAllStudent();
	}

}
