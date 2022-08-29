package com.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Doctor.Entity.Doctor;
import com.Doctor.ServiceInterface.DoctorServiceInterface;
import com.Doctor.VO.ResponseTemplateVO;
@CrossOrigin(allowedHeaders="*",origins="*")
@RestController
@RequestMapping("/Doctor")
public class DoctorController {
	@Autowired
	private DoctorServiceInterface DoctorService;
	@GetMapping("")
	public List<Doctor> getDoctors(){
		return this.DoctorService.getAllDoctorList();
	}
	@PostMapping("")
	public Doctor aDDDoctor(@RequestBody Doctor doc) {
		return this.DoctorService.addDoctor(doc);
	}
	@GetMapping("/{DID}")
	public Doctor getDoctor(@PathVariable Integer DID) {
		return this.DoctorService.getDoctorById(DID);
	}
	@GetMapping("/Patient/{DID}")
	public Doctor updateDoctorAttendedList(@PathVariable Integer DID) {
		return this.DoctorService.getAllPatientByDoctor(DID);
	}

}
