package com.tyss.eletter.ELetterResponse;

import java.util.List;

import com.tyss.eletter.dto.HRInfoBean;

import lombok.Data;

@Data
public class ELetterHRResponse {
	
	private int status;
	private String message;
	private String description;
	private List<HRInfoBean> hrInfoBeans;
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
	public List<HRInfoBean> getHrInfoBeans() {
		return hrInfoBeans;
	}
	public void setHrInfoBeans(List<HRInfoBean> hrInfoBeans) {
		this.hrInfoBeans = hrInfoBeans;
	}

	
}
