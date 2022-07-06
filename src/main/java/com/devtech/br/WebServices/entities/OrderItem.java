package com.devtech.br.WebServices.entities;

import java.io.Serializable;

public class OrderItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
		super();
	}

	public OrderItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//methods
	
	public double subTotal() {
		return quantity*price;
	}
}
