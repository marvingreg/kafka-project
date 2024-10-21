package com.kafka.application.model;

import java.math.BigDecimal;

public class Item {
	
	private String itemName;
	
	private String description;
	
	private BigDecimal itemPrice;
	
	private String itemImage;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemImage() {
		return itemImage;
	}

	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public Item(String itemName, String description, BigDecimal itemPrice, String itemImage) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.itemPrice = itemPrice;
		this.itemImage = itemImage;
	}
	
	public Item() {
		super();
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", description=" + description + ", itemPrice=" + itemPrice
				+ ", itemImage=" + itemImage + "]";
	}
	
	

}
