package com.digirestro.hungry.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.digirestro.hungry.config.Auditable;

@Entity
@Table(name = "h_option_group")
public class OptionGroups extends Auditable<String> {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
	private String ref_id;
	private String group_name;
	private String Description;
	private Boolean available;
	private Integer min_selectable;
	private Integer max_selectable; 
	private float price;
	private Integer sort_order;
	private Boolean active;
	
	@ManyToMany
	private List<Options> options;
	
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
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public Integer getMin_selectable() {
		return min_selectable;
	}
	public void setMin_selectable(Integer min_selectable) {
		this.min_selectable = min_selectable;
	}
	public Integer getMax_selectable() {
		return max_selectable;
	}
	public void setMax_selectable(Integer max_selectable) {
		this.max_selectable = max_selectable;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getSort_order() {
		return sort_order;
	}
	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<Options> getOptions() {
		return options;
	}
	public void setOptions(List<Options> options) {
		this.options = options;
	}
	

	

}
