package com.digirestro.hungry.model;


public class ItemsDetailsModel {
	
	String ref_id;
	String title;
	Boolean sold_at_store;
	Boolean available;
	String description;
	float price;
	int current_stock;
	String food_type;
	String[]  category_ref_ids;
	int sort_order;
	Boolean recommended;
	int weight;
	String img_url;
	

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
	public Boolean getSold_at_store() {
		return sold_at_store;
	}
	public void setSold_at_store(Boolean sold_at_store) {
		this.sold_at_store = sold_at_store;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCurrent_stock() {
		return current_stock;
	}
	public void setCurrent_stock(int current_stock) {
		this.current_stock = current_stock;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public String[] getCategory_ref_ids() {
		return category_ref_ids;
	}
	public void setCategory_ref_ids(String[] category_ref_ids) {
		this.category_ref_ids = category_ref_ids;
	}
	public int getSort_order() {
		return sort_order;
	}
	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}
	public Boolean getRecommended() {
		return recommended;
	}
	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	

}
