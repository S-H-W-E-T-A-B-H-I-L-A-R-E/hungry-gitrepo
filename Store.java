package com.digirestro.hungry.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.digirestro.hungry.config.Auditable;

@Entity
@Table(name = "h_store")
public class Store extends Auditable<String> {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
	private String city;
	private String name;
	private Integer min_pickup_time;
	private Integer min_delivery_time;
	private String contact_no;
	@NotBlank
	private String ref_id;
	private String start_time;
	private String end_time;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMin_pickup_time() {
		return min_pickup_time;
	}
	public void setMin_pickup_time(Integer min_pickup_time) {
		this.min_pickup_time = min_pickup_time;
	}
	public Integer getMin_delivery_time() {
		return min_delivery_time;
	}
	public void setMin_delivery_time(Integer min_delivery_time) {
		this.min_delivery_time = min_delivery_time;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	
	
	
}
