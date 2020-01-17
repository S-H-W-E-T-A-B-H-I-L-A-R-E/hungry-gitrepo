package com.digirestro.hungry.model;

public class OptionDetails {
	String ref_id;
	String title;
	String description;
	Boolean available;
	float price;
	Boolean sold_at_store;
	int current_stock;
	int weight;
	int food_type;
	String [] opt_grp_ref_ids;
	
	

	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Boolean getSold_at_store() {
		return sold_at_store;
	}
	public void setSold_at_store(Boolean sold_at_store) {
		this.sold_at_store = sold_at_store;
	}
	public int getCurrent_stock() {
		return current_stock;
	}
	public void setCurrent_stock(int current_stock) {
		this.current_stock = current_stock;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getFood_type() {
		return food_type;
	}
	public void setFood_type(int food_type) {
		this.food_type = food_type;
	}
	public String[] getOpt_grp_ref_ids() {
		return opt_grp_ref_ids;
	}
	public void setOpt_grp_ref_ids(String[] opt_grp_ref_ids) {
		this.opt_grp_ref_ids = opt_grp_ref_ids;
	}
	
}
