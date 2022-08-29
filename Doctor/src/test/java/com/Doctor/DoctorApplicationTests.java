package com.Doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.Doctor.Controller.DoctorController;
import com.Doctor.Entity.Doctor;
import com.Doctor.ServiceImpl.DoctorServiceImpl;

@SpringBootTest
class DoctorApplicationTests {
	@Mock
	private DoctorServiceImpl mockDoctorService;
	@InjectMocks
	private DoctorController temp;
	
	
	@Test
	public void testgetDoctors() {
		List<Doctor> doc=new ArrayList<>();
		doc.add(new Doctor(1001,"Sumit","Male",34,"Skin Specialist",10));
		doc.add(new Doctor(1002,"Sunil","Male",43,"Neuro Specialist",7));
		
		when(mockDoctorService.getAllDoctorList()).thenReturn(doc);
		assertEquals(temp.getDoctors().size(),2);
	}
	@Test
	public void testaDDDoctor() {
		Doctor a=new Doctor(1001,"Sumit","Male",34,"Skin Specialist",10);
		when(mockDoctorService.addDoctor(a)).thenReturn(a);
		assertEquals(temp.aDDDoctor(a),a);
	}
	@Test
	public void testgetDoctor() {
		Doctor a=new Doctor(1001,"Sumit","Male",34,"Skin Specialist",10);
		int DID=1001;
		when(mockDoctorService.getDoctorById(DID)).thenReturn(a);
		assertEquals(temp.getDoctor(DID).getDID(),1001);
	}
	@Test
	public void testupdateDoctorAttendedList() {
		Doctor a=new Doctor(1001,"Sumit","Male",34,"Skin Specialist",10);
		int DID=1001;
		when(mockDoctorService.getAllPatientByDoctor(DID)).thenReturn(a);
		assertEquals(temp.updateDoctorAttendedList(DID),a);
	}

}
