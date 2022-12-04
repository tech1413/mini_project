package com.shop;

public class Food {
	
	private String name;
	private String produceDate;
	private String expiredDate;
	
	public Food(String name, String produceDate, String expiredDate) {
		super();
		this.name = name;
		this.produceDate = produceDate;
		this.expiredDate = expiredDate;
	}
	
	public Food() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduceDate() {
		return produceDate;
	}
	public void setProduceDate(String produceDate) {
		this.produceDate = produceDate;
	}
	public String getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", produceDate=" + produceDate + ", expiredDate=" + expiredDate + "]";
	}
	
	

}
