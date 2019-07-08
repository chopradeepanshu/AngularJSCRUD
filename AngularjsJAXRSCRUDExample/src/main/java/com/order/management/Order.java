package com.order.management;

public class Order{
	
	int id;
	String orderNumber;	
	long phoneNumber;
	
	public Order() {
		super();
	}
	public Order(int i, String orderNumber,long phoneNumber) {
		super();
		this.id = i;
		this.orderNumber = orderNumber;
		this.phoneNumber=phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}	
	
}