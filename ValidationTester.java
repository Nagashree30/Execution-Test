package com.xworkz.college;

import com.xworkz.college.constants.Branches;
import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;

public class ValidationTester {
	public static void main(String[] args) {
		
	CollegeDTO collegeDTO=new CollegeDTO();
	collegeDTO.setName("GSSSIETW");
	collegeDTO.setBranches(Branches.ECE);
	collegeDTO.setLibrary(false);
	collegeDTO.setNoOfCabs(20);
	collegeDTO.setNoOfFaculties(60);
	collegeDTO.setNoOfFaculties(2000);
	
	CollegeService service=new CollegeServiceImpl();
	service.validateAndSave(collegeDTO);
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

