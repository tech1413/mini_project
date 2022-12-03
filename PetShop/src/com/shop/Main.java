package com.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private List<Owner> ownerList=new ArrayList<Owner>();;
	private List<Food> foodList=new ArrayList<Food>();
	private List<Pet> petList=new ArrayList<Pet>();
	
	public static void main(String[] args) {
		Main main=new Main();
		while(true) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("-----PET SHOP-----");
			System.out.println("Press 1: To add food");
			System.out.println("Press 2: To print all food");
			System.out.println("Press 3: To add owner");
			System.out.println("Press 4: To print all owner");
			System.out.println("Press 5: To add pet");
			System.out.println("Press 6: To print all pet");
			System.out.println("Press 7: Add a pet to owner");
			System.out.println("Press 8: Add a food to owner basket");
			System.out.println("Press 9: Add Pet Favourite Food");

			
			switch(sc.next()) {
			case "1":
				main.addFood();
				break;
			case "2":
				main.printFoodList();
				break;
			case "3":
				main.addOwner();
				break;
			case "4":
				main.printOwnerList();;
				break;
			case "5":
				main.addPet();
				break;
			case "6":
				main.printPetList();;
				break;
			case "7":
				main.addPetToOwner();;
				break;
			}
			
		}
	}
	
	public void addPetToOwner() {
		Scanner sc= new Scanner(System.in);
		String petName;
		String ownerName;
		Pet pet;
		Owner owner;
		System.out.println("\t Enter pet name to add:");
		petName=sc.next();
		
		if(!checkPetNameExist(petName)) {
			System.out.println("Pet name is INVALID!");
			return;
		}
		
		System.out.println("\t Enter owner name:");
		ownerName=sc.next();
		
		if(!checkOwnerNameExist(ownerName)) {
			System.out.println("Owner name is INVALID!");
			return;
		}
		
		pet=getPetInstanceByPetName(petName);
		owner=getOwnerInstanceByName(ownerName);
		addOwnerForAPet(owner,pet);

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

	public Pet getPetInstanceByPetName(String petName) {
		for(Pet pet:petList) {
			if(pet.getName().equals(petName)) {
				return pet;
			}
		}
		return null;
	}
	
	public Owner getOwnerInstanceByName(String ownerName) {
		for(Owner owner:ownerList) {
			if(owner.getName().equals(ownerName)) {
				return owner;
			}
		}
		return null;
	}
	
	public boolean checkPetNameExist(String petName) {
		for(Pet pet:petList) {
			if(pet.getName().equals(petName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkOwnerNameExist(String ownerName) {
		for(Owner owner:ownerList) {
			if(owner.getName().equals(ownerName)) {
				return true;
			}
		}
		return false;
	}
	
	public void addOwner() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Owner owner=new Owner();
		System.out.println("\t Add owners into the system:");
		System.out.println("\t Enter owner name:");
		owner.setName(sc.next());
		System.out.println("\t Enter owner age:");
		owner.setAge(sc.next());
		ownerList.add(owner);
		
	}

	public void addPet() {
		Scanner sc= new Scanner(System.in);
		Pet pet = new Pet();
		List<Food> favFoodList=new ArrayList<Food>();
		System.out.println("\t Add pet name into the system:");
		pet.setName(sc.next());
		System.out.println("\t Add pet age into the system:");
		pet.setAge(sc.nextInt());
//		Food food=getFoodInstance();
//		favFoodList.add(food);
//		pet.setFavouriteFood(favFoodList);
		petList.add(pet);
		
	}

	public Food getFoodInstance() {
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

	public void addFood() {
		Scanner sc= new Scanner(System.in);
		Food food=new Food();
		System.out.println("Add food into the system:");
		System.out.println("\t Enter food name:");
		food.setName(sc.next());
		System.out.println("\t Enter produce date (ex: 12/October/2021):");
		food.setProduceDate(sc.next());
		System.out.println("\t Enter expired date (ex: 12/October/2021):");
		food.setExpiredDate(sc.next());
		System.out.println("\t Storing below data....");
		System.out.println("\t"+food.toString());
		foodList.add(food);

	}
	
	public void printFoodList() {
		
		System.out.println(foodList.toString());
		
	}
	
	public void printPetList() {
		
		System.out.println(petList.toString());
		
	}
	
	public void printOwnerList() {
		System.out.println(ownerList.toString());
	}

}
