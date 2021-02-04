package com.xworkz.college.dao;

import com.xworkz.college.dto.CollegeDTO;

public interface CollegeDAO {
	boolean save(CollegeDTO dto);
	boolean updateNoOfCabsByNoOfStudents(int noOfCabs,int noOfStudents);
	boolean deleteByNoofFaculties(int noOfFaculties);
	CollegeDTO findByNoOfStudents(int i);

}
