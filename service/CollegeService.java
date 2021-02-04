package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeService {
	boolean validateAndSave(CollegeDTO collegeDTO);
	void deleteByNoOfFaculties();
	

}
