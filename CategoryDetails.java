package com.digirestro.hungry.model;

public class CategoryDetails {
	String ref_id;
	String name;
	String description;
	int sort_order;
	boolean active;
	String img_url;
	String parent_ref_id;
	
	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSort_order() {
		return sort_order;
	}
	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getParent_ref_id() {
		return parent_ref_id;
	}
	public void setParent_ref_id(String parent_ref_id) {
		this.parent_ref_id = parent_ref_id;
	}
	
	

}
