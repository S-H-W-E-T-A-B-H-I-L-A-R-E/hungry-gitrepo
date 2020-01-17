package com.digirestro.hungry.model;

import java.util.List;

public class ItemsModel {

	private String item_name;
	private String Description;
	private String img_url;
	private float price;
	private boolean available;
	private Integer current_stock;
	private Integer food_type;
	private Integer sort_order;
	private List<CategoryDetails> categoryDetails;
	private List<OptionGroupsDetails> optionGroups;
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Integer getCurrent_stock() {
		return current_stock;
	}
	public void setCurrent_stock(Integer current_stock) {
		this.current_stock = current_stock;
	}
	public Integer getFood_type() {
		return food_type;
	}
	public void setFood_type(Integer food_type) {
		this.food_type = food_type;
	}
	public Integer getSort_order() {
		return sort_order;
	}
	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}
	public List<CategoryDetails> getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(List<CategoryDetails> categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	public List<OptionGroupsDetails> getOptionGroups() {
		return optionGroups;
	}
	public void setOptionGroups(List<OptionGroupsDetails> optionGroups) {
		this.optionGroups = optionGroups;
	}
	
	

}
