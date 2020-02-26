package com.tyss.eletter.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="hr_info_bean")
public class HRInfoBean implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "h_id")
	private int  hId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email",unique = true)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="ty_id",unique = true)
	private String tyId;
	
	@Column(name="isactive")
	private boolean isActive;
	

	@OneToMany(cascade = CascadeType.ALL)
	private List<RecieverInfoBean> recieverInfoBean;


	public int gethId() {
		return hId;
	}


	public void sethId(int hId) {
		this.hId = hId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTyId() {
		return tyId;
	}


	public void setTyId(String tyId) {
		this.tyId = tyId;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public List<RecieverInfoBean> getRecieverInfoBean() {
		return recieverInfoBean;
	}


	public void setRecieverInfoBean(List<RecieverInfoBean> recieverInfoBean) {
		this.recieverInfoBean = recieverInfoBean;
	} 
	
	
	
	

}
