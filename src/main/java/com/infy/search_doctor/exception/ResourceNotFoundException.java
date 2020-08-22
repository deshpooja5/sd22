package com.infy.search_doctor.exception;

public class ResourceNotFoundException extends RuntimeException {

	@Override
	public String getMessage() {
		return "OOPS..Doctors not Available";
	}

}
