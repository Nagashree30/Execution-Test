package com.xworkz.college.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.college.dto.CollegeDTO;

public class CollegeDAOImpl implements CollegeDAO {
	
private List<CollegeDTO>college;
	
	public CollegeDAOImpl() {
		this.college=new ArrayList<CollegeDTO>();
	}

	@Override
	public boolean save(CollegeDTO dto) {

		System.out.println("Invoke save in collegeDaoimpl");
		boolean added=this.college.add(dto);
		if(added) 
			System.out.println("college dto added");
			else
				System.out.println("college dto not added");
		
		return added;
		
	}



	@Override
	public boolean deleteByNoofFaculties(int noOfFaculties) {
		Iterator<CollegeDTO> iterator=this.college.iterator();
		while(iterator.hasNext()) {
			CollegeDTO dto=iterator.next();
			if(dto.getNoOfFaculties()==noOfFaculties) {
				iterator.remove();
			  return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean updateNoOfCabsByNoOfStudents(int noOfCabs, int noOfStudents) {
		System.out.println("invoked updateNoOfCabsByNoOfStudents");
		CollegeDTO dto=this.findByNoOfStudents(noOfStudents);
		if(dto!=null) {
	
		System.out.println("can update");
		dto.setNoOfCabs(noOfCabs);
		return true;
	}
	else {
		System.out.println("cannot update");
	}
		return false;
		

}

	public CollegeDTO findByNoOfStudents(int noOfStudents) {
		return (CollegeDTO) college;
		
		
	}
}
	


	
	
	
	
	
	
	


























