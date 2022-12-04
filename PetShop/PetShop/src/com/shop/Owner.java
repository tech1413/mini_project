package com.shop;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	
	private String name;
	private String age;
	private List<Pet> petList;
	private List<Food> shoppingCart;
	
	
	public Owner(String name, String age, List<Pet> petList, List<Food> shoppingCart) {
		super();
		this.name = name;
		this.age = age;
		this.petList = petList;
		this.shoppingCart = shoppingCart;
	}
	
	
	public Owner() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Pet> getPetList() {
		return petList;
	}
	public void setPetList(List<Pet> petList) {
		
		this.petList = petList;
	}
	public List<Food> getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(List<Food> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}


	@Override
	public String toString() {
		return "Owner [name=" + name + ", age=" + age + ", petList=" + petList + ", shoppingCart=" + shoppingCart + "]";
	}
	
	

}
