package com.Patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Patient.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
