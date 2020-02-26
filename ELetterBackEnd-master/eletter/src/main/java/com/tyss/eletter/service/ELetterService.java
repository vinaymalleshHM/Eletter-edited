package com.tyss.eletter.service;

import java.util.List;

import com.tyss.eletter.dto.HRInfoBean;

public interface ELetterService {
	
	boolean register(HRInfoBean hrInfoBean);
	HRInfoBean auth(String email, String password);
	
	boolean changePassword(int id,String password);
	
	List<HRInfoBean> search(String name);
	List<HRInfoBean> gethrInfo(int id);
	
	
	boolean deleteHRInfoBean(int id);

}
