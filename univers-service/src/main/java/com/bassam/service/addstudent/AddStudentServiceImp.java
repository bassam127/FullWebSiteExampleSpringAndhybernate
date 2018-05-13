package com.bassam.service.addstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bassam.model.entiti.Student;
import com.bassam.repository.student.StudentRepository;

@Service
public class AddStudentServiceImp implements AddStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student studentDAO) {
		Student student = new Student();
		student.setFirstName(studentDAO.getFirstName());
		student.setLastName(studentDAO.getLastName());
		student.setAge(studentDAO.getAge());
		student.setGender(studentDAO.getGender());
		student.setUniversity(studentDAO.getUniversity());

		studentRepository.save(student);
		
	}

}
