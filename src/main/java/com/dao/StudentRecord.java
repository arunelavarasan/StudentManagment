package com.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class StudentRecord {

	@Id
	private int id;
	private String name;
	private String email;
	private String phoneno;
	private String adhaarid;
	private String address;
	private String university;
	private String branch;
	private String marks;
//	private String marksdocuments;
//	
//	private String ugmarksheet;

	public StudentRecord() {

	}

	

	public StudentRecord(String name, String phoneno, String adhaarid, String address, String university, String branch,
			String marks) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.adhaarid = adhaarid;
		this.address = address;
		this.university = university;
		this.branch = branch;
		this.marks = marks;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getAdhaarid() {
		return adhaarid;
	}

	public void setAdhaarid(String adhaarid) {
		this.adhaarid = adhaarid;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "StudentRecord [name=" + name + ", phoneno=" + phoneno + ", address=" + address + ", university="
				+ university + "]";
	}

}
