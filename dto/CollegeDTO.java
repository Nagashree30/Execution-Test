package com.xworkz.college.dto;

import com.xworkz.college.constants.Branches;

public class CollegeDTO {

	private String name;
	private Branches Branches;
	private int noOfFaculties;
	private int noOfCabs;
	private boolean library;
	private int noOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branches getBranches() {
		return Branches;
	}

	public void setBranches(Branches branches) {
		Branches = branches;
	}

	public int getNoOfFaculties() {
		return noOfFaculties;
	}

	public void setNoOfFaculties(int noOfFaculties) {
		this.noOfFaculties = noOfFaculties;
	}

	public int getNoOfCabs() {
		return noOfCabs;
	}

	public void setNoOfCabs(int noOfCabs) {
		this.noOfCabs = noOfCabs;
	}

	public boolean isLibrary() {
		return library;
	}

	public void setLibrary(boolean library) {
		this.library = library;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public CollegeDTO() {
	}

	public CollegeDTO(String name, Branches branches, int noOfFaculties, int noOfCabs, boolean library,
			int noOfStudents) {
		super();
		this.name = name;
		Branches = branches;
		this.noOfFaculties = noOfFaculties;
		this.noOfCabs = noOfCabs;
		this.library = library;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "CollegeDTO [name=" + name + ", Branches=" + Branches + ", noOfFaculties=" + noOfFaculties
				+ ", noOfCabs=" + noOfCabs + ", library=" + library + ", noOfStudents=" + noOfStudents + "]";
	}

}
