package com.shop;

import java.util.List;

public class Pet {
	
	private String name;
	private Integer age;
	private String owner;
	private List<Food> favouriteFood;
	public Pet(String name, Integer age, String owner, List<Food> favouriteFood) {
		super();
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.favouriteFood = favouriteFood;
	}
	
	public Pet() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<Food> getFavouriteFood() {
		return favouriteFood;
	}
	public void setFavouriteFood(List<Food> favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", owner=" + owner + ", favouriteFood=" + favouriteFood + "]";
	}

	
}
