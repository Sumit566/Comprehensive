package com.Patient.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Patient_RegistrationID")
	private int RID;
	@Column(name="Patient_Name")
	private String PName;
	@Column(name="Patient_VisitedDocter")
	private String visitedDoctor;
	@Column(name="Patient_DateVisited")
	private String dateOfVisit;
	@Column(name="Patient_Prescription")
	private String prescription;
	@Column(name="Patient_PersonalID")
	private int PID;
	
	
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	public Patient(int rID, String pName, String visitedDoctor, String dateOfVisit, String prescription, int pID) {
		super();
		RID = rID;
		PName = pName;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisit = dateOfVisit;
		this.prescription = prescription;
		PID = pID;
	}
	public Patient() {
		super();
	}
}
