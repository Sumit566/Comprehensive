package com.Doctor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Doctor.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
