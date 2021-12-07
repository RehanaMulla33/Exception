package com.xworkz.Assignment4.WaterHeater.dto;

public class HeaterDto {
	private String brand;
	private int price;
	private String category;
	private String warranty;
	
	public HeaterDto(String brand, int price, String category, String warranty) {
	System.out.println("inside Heater DTO constructor");
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.warranty = warranty;
	}


	public String getBrand() {
		return brand;
	}

	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}

	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	
	public String getWarranty() {
		return warranty;
	}

	
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	
	public String toString() {
		return "HeaterDto [brand=" + brand + ", price=" + price + ", category=" + category + ", warranty=" + warranty
				+ "]";
	}
	
	
	

}
