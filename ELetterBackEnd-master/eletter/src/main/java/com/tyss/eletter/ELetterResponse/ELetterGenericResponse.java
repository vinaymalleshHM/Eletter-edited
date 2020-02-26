package com.tyss.eletter.ELetterResponse;

import lombok.Data;

@Data
public class ELetterGenericResponse {
	
	private int status;
	private String message;
	private String description;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
