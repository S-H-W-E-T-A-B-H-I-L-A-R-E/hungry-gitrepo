package com.digirestro.hungry.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.digirestro.hungry.config.Auditable;

@Entity
@Table(name = "h_items")
public class Items extends Auditable<String> {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
	private String ref_id;
	private String item_name;
	private String Description;
	private String img_url;
	private float price;
	private boolean available;
	private Integer current_stock;
	private Integer food_type;
	private Integer sort_order;
	
	@OneToMany
	private List<OptionGroups> option_group;
	
	@ManyToMany
	private List<Category> category;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef_id() {
		return ref_id;
	}
	public void setRef_id(String ref_id) {
		this.ref_id = ref_id;
	}
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
	
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category_id) {
		this.category = category_id;
	}
	public List<OptionGroups> getOption_group() {
		return option_group;
	}
	public void setOption_group(List<OptionGroups> option_group) {
		this.option_group = option_group;
	}
	
	
}
