package com.sastra.bean;

public class Restaurent {
	private String menuid;
	private String menuname;
	private String category;
	private String type; 
	private double cost;
	private String status;
	@Override
	public String toString() {
		return "\nRestaurent [menuid=" + menuid + ", menuname=" + menuname + ", category=" + category + ", type=" + type
				+ ", cost=" + cost + ", status=" + status + "]";
	}
	public Restaurent(String menuid, String menuname, String category, String type, double cost, String status) {
		super();
		this.menuid = menuid;
		this.menuname = menuname;
		this.category = category;
		this.type = type;
		this.cost = cost;
		this.status = status;
	}
	public Restaurent() {
		// TODO Auto-generated constructor stub
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
