package com.digirestro.hungry.model;

public class StoreModel {
	
	Integer id;
	String address;
	Double latitude;
	Double longitude;
	String merchant_ref_id;
	String name;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getMerchant_ref_id() {
		return merchant_ref_id;
	}
	public void setMerchant_ref_id(String merchant_ref_id) {
		this.merchant_ref_id = merchant_ref_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
