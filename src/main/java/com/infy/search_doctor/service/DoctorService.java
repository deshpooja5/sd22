package com.infy.search_doctor.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.search_doctor.dto.DoctorDTO;
import com.infy.search_doctor.entity.DoctorEntity;
import com.infy.search_doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	// Get all the Doctors Details
	
	public List<DoctorDTO> getAllDoctors(){
		List<DoctorEntity> doctor=doctorRepository.findAll();
		List<DoctorDTO> doctorDTOs=new ArrayList<>();
		for(DoctorEntity de:doctor) {
			DoctorDTO doctorDTO=DoctorDTO.valueOf(de);
			doctorDTOs.add(doctorDTO);
			
		}
		return doctorDTOs;
	}
	
	// get all the doctors by speciality
	public DoctorDTO getBySpeciality(String speciality){
		DoctorDTO doctorDTO=null;
		List<DoctorEntity> docEntity=doctorRepository.findAll();
		
		for(DoctorEntity de: docEntity) {
			if(de.getSpeciality().equals(speciality)) {
				doctorDTO=DoctorDTO.valueOf(de);
			}
		}
		return doctorDTO;
	}
	
	// get all the doctors by city
	public DoctorDTO getByCity(String city) {
		DoctorDTO doctorDTO=null;
		List<DoctorEntity> doctorEntity=doctorRepository.findAll();
		for(DoctorEntity docEnt:doctorEntity) {
			if(docEnt.getCity().equals(city)) {
				doctorDTO=DoctorDTO.valueOf(docEnt);
			}
		}
		return doctorDTO;
	}
	
	//get all the doctors by visiting day
	public DoctorDTO getByDate(String date) {
		DoctorDTO doctorDTO=null;
		List<DoctorEntity> doctEntity=doctorRepository.findAll();
		for(DoctorEntity docEn:doctEntity) {
			if(docEn.getDate().equals(date)) {
				
				doctorDTO=DoctorDTO.valueOf(docEn);
				System.out.println(doctorDTO);
			}
		}
		return doctorDTO;
	}

	

	
}

