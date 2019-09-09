package com.admin;

public class product {
	private int id;
	private String name;
	private String description;
	private int catgoryId;
	private String prize;
	private String quantity;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getCatgoryId() {
		return catgoryId;
	}
	public void setCatgoryId(int catgoryId) {
		this.catgoryId = catgoryId;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
}
