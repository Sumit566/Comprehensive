package com.Patient.ServiceInterface;

import java.util.List;

import com.Patient.Entity.Patient;

public interface PatientServiceInterface {
	public List<Patient> getAllPatient();
	public Patient getPatientByID(int RID);
	public Patient addPatient(Patient pet);
	public Patient updatePatient(Patient pat,int RID);
}
