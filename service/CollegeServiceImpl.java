package com.xworkz.college.service;

import com.xworkz.college.constants.Branches;
import com.xworkz.college.dto.CollegeDTO;

public class CollegeServiceImpl implements CollegeService {

	public CollegeServiceImpl() {
		System.out.println("created college service impl");
	}

	@Override
	public boolean validateAndSave(CollegeDTO collegeDTO) {
		boolean validData = false;
		if (collegeDTO != null) {
			System.out.println("dto is not null , we can validate the dto fields");
			String name = collegeDTO.getName();
			if (name != null && name.length() >= 3 && !name.equals("") && !name.isEmpty()) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is not valid");
				validData = false;
			}
		}

		if (validData) {
			Branches branches = collegeDTO.getBranches();
			if (branches != null) {
				System.out.println("branch is not null,can validate");
				validData = true;
			} else {
				System.out.println("not a valid branch");
				validData = false;
			}
		}
		return validData;

	}

	@Override
	public void deleteByNoOfFaculties() {
		// TODO Auto-generated method stub

	}

}
