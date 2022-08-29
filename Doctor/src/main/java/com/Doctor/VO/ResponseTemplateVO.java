package com.Doctor.VO;

import java.util.List;

import com.Doctor.Entity.Doctor;

public class ResponseTemplateVO {
	private Doctor doctor;
	private List<Patient> patient;
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	public ResponseTemplateVO(Doctor doctor, List<Patient> patient) {
		super();
		this.doctor = doctor;
		this.patient = patient;
	}
	public ResponseTemplateVO() {
		super();
	}
}
