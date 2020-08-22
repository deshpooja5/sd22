package com.infy.search_doctor.dto;

import java.util.Date;

import com.infy.search_doctor.entity.DoctorEntity;

public class DoctorDTO {
	Integer doctorId;
	String name;
	String speciality;
	String city;
	String date;
	
	public DoctorDTO(Integer doctorId, String name, String speciality, String city, String date) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.speciality = speciality;
		this.city = city;
		this.date = date;
	}
	
	
	public DoctorDTO() {
	super();
}


	public Integer getDoctorId() {
		return doctorId;
	}
	
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//Converts Entity into DTO
	public static DoctorDTO valueOf(DoctorEntity doctorEntity) {
		DoctorDTO doctorDTO= new DoctorDTO();
		doctorDTO.setDoctorId(doctorEntity.getDoctorId());
		doctorDTO.setCity(doctorEntity.getCity());
		doctorDTO.setName(doctorEntity.getName());
		doctorDTO.setSpeciality(doctorEntity.getSpeciality());
		doctorDTO.setDate(doctorEntity.getDate());
		return doctorDTO;
	}


	

}

