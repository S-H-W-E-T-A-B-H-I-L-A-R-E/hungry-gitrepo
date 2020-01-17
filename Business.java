package com.digirestro.hungry.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.digirestro.hungry.config.Auditable;

@Entity
@Table(name = "h_business")
public class Business extends Auditable<String> {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String business_name;
	private String business_owner_name;
	private String business_contact_no;
	private String business_address;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getBusiness_owner_name() {
		return business_owner_name;
	}
	public void setBusiness_owner_name(String business_owner_name) {
		this.business_owner_name = business_owner_name;
	}
	public String getBusiness_contact_no() {
		return business_contact_no;
	}
	public void setBusiness_contact_no(String business_contact_no) {
		this.business_contact_no = business_contact_no;
	}
	public String getBusiness_address() {
		return business_address;
	}
	public void setBusiness_address(String business_address) {
		this.business_address = business_address;
	}
	
	
	

}
