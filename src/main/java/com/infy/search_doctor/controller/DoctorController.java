package com.infy.search_doctor.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.infy.search_doctor.dto.DoctorDTO;
import com.infy.search_doctor.entity.DoctorEntity;
import com.infy.search_doctor.exception.ResourceNotFoundException;
import com.infy.search_doctor.repository.DoctorRepository;
import com.infy.search_doctor.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	DoctorRepository doctorRepository;
	
	
	 
	
	//to get the details of all doctors
	@GetMapping(value="/doctors", produces=MediaType.APPLICATION_JSON_VALUE)
		public List<DoctorDTO> getAllDoctors(){
			return doctorService.getAllDoctors();
		}
	
	//get the details of doctor according to speciality
	@GetMapping(value="/doctors/{speciality}", produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DoctorDTO> getBySpeciality(@PathVariable String speciality){
			DoctorDTO d= doctorService.getBySpeciality(speciality);
			if(d==null) {
				throw new ResourceNotFoundException();
			}
			return new ResponseEntity<DoctorDTO>(d,HttpStatus.OK);
					
	}
	
	//get the details of doctors according to city
	@GetMapping(value="/doctors/city/{city}", produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DoctorDTO> getByCity(@PathVariable String city) {
		
			DoctorDTO doc= doctorService.getByCity(city);
			if(doc==null) {
				throw new ResourceNotFoundException();
				
			}
			return new ResponseEntity<DoctorDTO>(doc,HttpStatus.OK);
	}
	
	//get the details of doctors according to visiting day
	@GetMapping(value="/doctors/date/{date}", produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<DoctorDTO> getByDate(@PathVariable String date) {
			DoctorDTO dc=doctorService.getByDate(date);
			if(dc==null) {
				throw new ResourceNotFoundException();
			}
			return new ResponseEntity<DoctorDTO>(dc,HttpStatus.OK);
	}
	
	
}

