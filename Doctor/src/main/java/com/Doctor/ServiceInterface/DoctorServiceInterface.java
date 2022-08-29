package com.Doctor.ServiceInterface;

import java.util.List;

import com.Doctor.Entity.Doctor;
import com.Doctor.VO.ResponseTemplateVO;

public interface DoctorServiceInterface {
	public List<Doctor> getAllDoctorList();
	public Doctor addDoctor(Doctor doc);
	public Doctor getDoctorById(int DID);
	public Doctor getAllPatientByDoctor(int DID);
}
