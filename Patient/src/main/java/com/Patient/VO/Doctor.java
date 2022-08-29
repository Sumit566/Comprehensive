package com.Patient.VO;

import javax.persistence.Column;

public class Doctor {
	private int DID;
	private String Dname;
	private String Gender;
	private int age;
	private String SpecialistField;
	private int patientAttended;
	public int getDID() {
		return DID;
	}
	public void setDID(int dID) {
		DID = dID;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialistField() {
		return SpecialistField;
	}
	public void setSpecialistField(String specialistField) {
		SpecialistField = specialistField;
	}
	public int getPatientAttended() {
		return patientAttended;
	}
	public void setPatientAttended(int patientAttended) {
		this.patientAttended = patientAttended;
	}
	public Doctor(int dID, String dname, String gender, int age, String specialistField, int patientAttended) {
		super();
		DID = dID;
		Dname = dname;
		Gender = gender;
		this.age = age;
		SpecialistField = specialistField;
		this.patientAttended = patientAttended;
	}
	public Doctor() {
		super();
	}
	
	

}
