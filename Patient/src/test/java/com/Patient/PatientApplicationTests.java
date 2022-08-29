package com.Patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.Patient.Controller.PatientController;
import com.Patient.Entity.Patient;
import com.Patient.ServiceImpl.PatientServiceImpl;

@SpringBootTest
class PatientApplicationTests {
	@Mock
	private PatientServiceImpl mockPatientService;
	@InjectMocks
	private PatientController temp;

	@Test
	public void testgetPatient() {
		List<Patient> pat=new ArrayList<>();
		pat.add(new Patient(10001,"Soul","Sumit","27-08-2022","Cough And Cold",101));
		pat.add(new Patient(10002,"GodLike","Sunil","25-08-2022","Cold",102));
		
		when(mockPatientService.getAllPatient()).thenReturn(pat);
		assertEquals(temp.getPatient().size(),2);
	}
	@Test
	public void testgetPatientBYID() {
		Patient p=new Patient(10001,"Soul","Sumit","27-08-2022","Cough And Cold",101);
		int RID=1001;
		when(mockPatientService.getPatientByID(RID)).thenReturn(p);
		assertEquals(temp.getPatientBYID(RID).getRID(),p.getRID());
	}
	@Test
	public void testAddPatients() {
		Patient p=new Patient(10001,"Soul","Sumit","27-08-2022","Cough And Cold",101);
		when(mockPatientService.addPatient(p)).thenReturn(p);
		assertEquals(temp.AddPatients(p),p);
	}
	@Test
	public void testupdatePatint() {
		Patient p=new Patient(10001,"Soul","Sumit","27-08-2022","Cough And Cold",101);
		int RID=10001;
		when(mockPatientService.updatePatient(p, RID)).thenReturn(p);
		assertEquals(temp.updatePatint(p, RID),p);
	}

}