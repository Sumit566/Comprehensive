package com.Patient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Patient.Entity.Patient;
import com.Patient.ServiceInterface.PatientServiceInterface;
@CrossOrigin(allowedHeaders="*",origins="*")
@RestController
@RequestMapping("/Patient")
public class PatientController {
	@Autowired
	private PatientServiceInterface PatientService;
	
	@GetMapping("")
	public List<Patient> getPatient(){
		return this.PatientService.getAllPatient();
	}
	@GetMapping("/{RID}")
	public Patient getPatientBYID(@PathVariable Integer RID) {
		return this.PatientService.getPatientByID(RID);
	}
	@PostMapping("")
	public Patient AddPatients(@RequestBody Patient pet) {
		return this.PatientService.addPatient(pet);
	}
	@PutMapping("/{RID}")
	public Patient updatePatint(@RequestBody Patient pat,@PathVariable Integer RID) {
		return this.PatientService.updatePatient(pat, RID);
	}

}
