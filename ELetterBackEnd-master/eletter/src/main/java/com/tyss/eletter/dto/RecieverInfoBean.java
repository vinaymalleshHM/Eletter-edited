package com.tyss.eletter.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "reciever_info_bean")
public class RecieverInfoBean implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="r_id")
	private int rId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ty_id")
	private String tyId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="type_of_letter")
	private String typeOfLetter;
	
	@Column(name="from_mail")
	private String from;
	
	@ElementCollection
	@CollectionTable(name="recievers")
	@Column(name="to_mail")
	private List<String> to;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyId() {
		return tyId;
	}

	public void setTyId(String tyId) {
		this.tyId = tyId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTypeOfLetter() {
		return typeOfLetter;
	}

	public void setTypeOfLetter(String typeOfLetter) {
		this.typeOfLetter = typeOfLetter;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}
	

	
	
	
	
}
