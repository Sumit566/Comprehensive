package com.Patient.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Patient.Entity.Patient;
import com.Patient.Repository.PatientRepository;
import com.Patient.ServiceInterface.PatientServiceInterface;
import com.Patient.VO.Doctor;
@Service
public class PatientServiceImpl implements PatientServiceInterface{
	@Autowired
	private PatientRepository PatientDao;
	
	@Autowired
	private RestTemplate resttemplate;

	@Override
	public List<Patient> getAllPatient() {
		return this.PatientDao.findAll();
	}

	@Override
	public Patient getPatientByID(int RID) {
		return this.PatientDao.findById(RID).get();
	}

	@Override
	public Patient addPatient(Patient pet) {
		int did=0;
		ResponseEntity<Doctor[]> p=resttemplate.getForEntity("http://Doctor-Service/Doctor", Doctor[].class);
		Doctor[] f=p.getBody();
		for(Doctor i:f) {
			if(i.getDname().equalsIgnoreCase(pet.getVisitedDoctor())) {
				did=i.getDID();
				break;
			}
		}
		Doctor d=resttemplate.getForObject("http://Doctor-Service/Doctor/Patient/"+did, Doctor.class);
		return this.PatientDao.save(pet);
	}

	@Override
	public Patient updatePatient(Patient pat,int RID) {
		Patient p=this.PatientDao.findById(RID).get();
		p.setPName(pat.getPName());
		p.setDateOfVisit(pat.getDateOfVisit());
		p.setPrescription(pat.getPrescription());
		p.setVisitedDoctor(pat.getVisitedDoctor());
		return this.PatientDao.save(p);
	}

}
