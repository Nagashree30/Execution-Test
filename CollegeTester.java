package com.xworkz.college;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.college.dao.CollegeDAO;
import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeTester {

	public static void main(String[] args) {

		CollegeDTO collegeDTO = new CollegeDTO();
		collegeDTO.setLibrary(true);
		collegeDTO.setName("GSSSIETW");
		collegeDTO.setNoOfCabs(20);
		collegeDTO.setNoOfFaculties(50);
		collegeDTO.setNoOfStudents(2000);

		CollegeDAO dao = new CollegeDAOImpl();
		dao.save(collegeDTO);
		CollegeDTO collegeDTO1 = new CollegeDTO();
		collegeDTO1.setLibrary(true);
		collegeDTO1.setName("Vidyavardhaka");
		collegeDTO1.setNoOfCabs(25);
		collegeDTO1.setNoOfFaculties(60);
		collegeDTO1.setNoOfStudents(1000);
		dao.save(collegeDTO1);
		
		List<CollegeDTO> collegeDTOs=new ArrayList <CollegeDTO>();
		collegeDTOs.add(collegeDTO);
		collegeDTOs.add(collegeDTO1);
		System.out.println(collegeDTOs);
		

		boolean dtoafterDelete=dao.deleteByNoofFaculties(60);
		System.out.println(dtoafterDelete);
		CollegeDTO dtoFound = dao.findByNoOfStudents(1000);
		System.out.println(dtoFound);
		
		

	}

}
