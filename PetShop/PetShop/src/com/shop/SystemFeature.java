package com.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemFeature {
	
	public void addFoodToOwnerBasketByName(String foodName, String ownerName,List<Owner> ownerList,List<Food> foodList) {
		Owner owner=getOwnerInstanceByName(ownerName, ownerList);
		Food food=getFoodInstanceByFoodName(foodName, foodList);
		List<Food> listOfFood;
		if(owner!=null) {
			listOfFood=owner.getShoppingCart();
		}else {
			return;
		}
		
		if(listOfFood==null) {
			listOfFood=new ArrayList<Food>();
			listOfFood.add(food);
		}else {
			listOfFood.add(food);
		}
		if(owner!=null) {
			owner.setShoppingCart(listOfFood);
		}
		
		
	}
	
	public void addOwnerForAPet(Owner owner, Pet pet) {
		List<Pet> ownerPetList=owner.getPetList();
		if(ownerPetList==null) {
			ownerPetList=new ArrayList<Pet>();
		}
		ownerPetList.add(pet);
		owner.setPetList(ownerPetList);
		pet.setOwner(owner.getName());
		
	}
	
	public Food getFoodInstanceByFoodName(String foodname, List<Food> foodList) {
		for(Food food:foodList) {
			if(food.getName().equals(foodname)) {
				return food;
			}
		}
		return null;
	}

	public Pet getPetInstanceByPetName(String petName, List<Pet> petList) {
		for(Pet pet:petList) {
			if(pet.getName().equals(petName)) {
				return pet;
			}
		}
		return null;
	}
	
	public Owner getOwnerInstanceByName(String ownerName, List<Owner> ownerList) {
		for(Owner owner:ownerList) {
			if(owner.getName().equals(ownerName)) {
				return owner;
			}
		}
		return null;
	}
	
	public boolean checkPetNameExist(String petName, List<Pet> petList) {
		for(Pet pet:petList) {
			if(pet.getName().equals(petName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkOwnerNameExist(String ownerName,List<Owner> ownerList) {
		for(Owner owner:ownerList) {
			if(owner.getName().equals(ownerName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkFoodNameExist(String foodName,List<Food> foodList) {
		for(Food food:foodList) {
			if(food.getName().equals(foodName)) {
				return true;
			}
		}
		return false;
	}
	

	public Food getFoodInstance(List<Food> foodList) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter favourite food name:");
		String inputFood=sc.next();
		for(Food i:foodList) {
			if(i.getName().equals(inputFood)) {
				return i;
			}
		}
		return null;
	}
	
	public void printFoodList(List<Food> foodList) {
		
		System.out.println(foodList.toString());
		
	}
	
	public void printPetList(List<Pet> petList) {
		
		System.out.println(petList.toString());
		
	}
	
	public void printOwnerList(List<Owner> ownerList) {
		System.out.println(ownerList.toString());
	}

}
