package com.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private List<Owner> ownerList=new ArrayList<Owner>();;
	private List<Food> foodList=new ArrayList<Food>();
	private List<Pet> petList=new ArrayList<Pet>();
	private SystemFeature sys=new SystemFeature();
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
				main.sys.printFoodList(main.foodList);
				break;
			case "3":
				main.addOwner();
				break;
			case "4":
				main.sys.printOwnerList(main.ownerList);;
				break;
			case "5":
				main.addPet();
				break;
			case "6":
				main.sys.printPetList(main.petList);;
				break;
			case "7":
				main.addPetToOwner();;
				break;
			case "8":
				main.addFoodToOwnerBasket();;
				break;
			case "9":
				main.addPetFavFood();;
				break;
			}
			
		}
	}
	
	public void addPetFavFood() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String petName;
		String favFood;
		Pet pet;
		System.out.println("\t Enter pet name:");
		petName=sc.next();
		if(!sys.checkPetNameExist(petName,petList)) {
			System.out.println("Pet name is INVALID!");
			return;
		}
		System.out.println("\t Enter pet's favourite food name:");
		favFood=sc.next();
		if(!sys.checkFoodNameExist(favFood,foodList)) {
			System.out.println("Food name is INVALID!");
			return;
		}
		pet=sys.getPetInstanceByPetName(petName,petList);
		Food food=sys.getFoodInstanceByFoodName(favFood,foodList);
		List<Food> foodList=pet.getFavouriteFood();
		if(foodList==null) {
			foodList=new ArrayList<Food>();
			foodList.add(food);
		}else {
			foodList.add(food);
		}
		pet.setFavouriteFood(foodList);
	}

	public void addFoodToOwnerBasket() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String foodName;
		System.out.println("\t Enter food name to add owner basket:");
		foodName = sc.next();
		if(!sys.checkFoodNameExist(foodName,foodList)) {
			System.out.println("Food name is INVALID!");
			return;
		}
		System.out.println("\t Enter owner name:");
		String ownerName = sc.next();
		if(!sys.checkOwnerNameExist(ownerName,ownerList)) {
			System.out.println("Owner name is INVALID!");
			return;
		}
		
		sys.addFoodToOwnerBasketByName(foodName,ownerName,ownerList,foodList);
	}
	


	public void addPetToOwner() {
		Scanner sc= new Scanner(System.in);
		String petName;
		String ownerName;
		Pet pet;
		Owner owner;
		System.out.println("\t Enter pet name to add:");
		petName=sc.next();
		
		if(!sys.checkPetNameExist(petName,petList)) {
			System.out.println("Pet name is INVALID!");
			return;
		}
		
		System.out.println("\t Enter owner name:");
		ownerName=sc.next();
		
		if(!sys.checkOwnerNameExist(ownerName,ownerList)) {
			System.out.println("Owner name is INVALID!");
			return;
		}
		
		pet=sys.getPetInstanceByPetName(petName,petList);
		owner=sys.getOwnerInstanceByName(ownerName,ownerList);
		sys.addOwnerForAPet(owner,pet);

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
		petList.add(pet);
		
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
	


}
