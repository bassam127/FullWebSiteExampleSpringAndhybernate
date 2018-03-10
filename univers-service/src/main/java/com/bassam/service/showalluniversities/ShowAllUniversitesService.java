package com.bassam.service.showalluniversities;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bassam.model.entiti.University;

public interface ShowAllUniversitesService {
	
	public List<University> getAll();

}
