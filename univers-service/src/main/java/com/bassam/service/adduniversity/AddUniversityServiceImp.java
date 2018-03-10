package com.bassam.service.adduniversity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bassam.model.entiti.University;
import com.bassam.repository.university.UniversityRepository;

@Service
public class AddUniversityServiceImp implements AddUniversityService {

	@Autowired
	private UniversityRepository universityRepository;

	public void addUniversity(University universityDao) {
		University university = new University();

		university.setUniversityName(universityDao.getUniversityName());
		university.setUniversityCity(universityDao.getUniversityCity());
		university.setUniversityCountry(universityDao.getUniversityCountry());

		universityRepository.save(university);

	}

}
