package com.digirestro.hungry.model;

public class OptionGroupsDetails {
	
	String ref_id;
	String title;
	String description;
	int min_selectable;
	int max_selectable;
	int sort_order;
	boolean active;
	
	String[] item_ref_ids;
	
	
	
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
	public int getMin_selectable() {
		return min_selectable;
	}
	public void setMin_selectable(int min_selectable) {
		this.min_selectable = min_selectable;
	}
	public int getMax_selectable() {
		return max_selectable;
	}
	public void setMax_selectable(int max_selectable) {
		this.max_selectable = max_selectable;
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
	public String[] getItem_ref_ids() {
		return item_ref_ids;
	}
	public void setItem_ref_ids(String[] item_ref_ids) {
		this.item_ref_ids = item_ref_ids;
	}

}
