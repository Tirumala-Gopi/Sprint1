package com.fdmgroup.castingExericse;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
//		CalorieCounter obj1=new CalorieCounter();
//		
//		ArrayList<FoodItem>lowcalorieFoods=obj1.getLowCalorieFoods();
//	
//		
		
		
		Toy toy=new Toy(10,18);
		Laptop laptop=new Laptop(2.4,16.0,256.0);
		
		
		Snack snack1 =new Snack(7,11);
		snack1.setCalories(501);
		Snack snack2 =new Snack(3,1);
		snack2.setCalories(499);
		
		
		ReadyMeal meal1=new ReadyMeal("chicken");
		meal1.setCalories(1100);
		ReadyMeal meal2=new ReadyMeal("bread");
		meal2.setCalories(100);
	
		Basket basket=new Basket();
		CalorieCounter caloriecounter=new CalorieCounter();
		
		basket.addItem(meal2);
		basket.addItem(meal1);
		basket.addItem(snack2);
		basket.addItem(snack1);
		basket.addItem(laptop);
		basket.addItem(toy);
		
		//System.out.println(meal1.getCalories());
		
		basket.removeItem(snack1);
		//System.out.println(basket.getBasketItems());
		
		caloriecounter.addLowCalorieFood(meal2);
		caloriecounter.addLowCalorieFood(snack2);
		caloriecounter.addLowCalorieFood(snack1);
		caloriecounter.addLowCalorieFood(meal1);
		//System.out.println(caloriecounter.getAllLowCalorieFoods());

		ArrayList<FoodItem>lowCalorieFoods=(ArrayList<FoodItem>) caloriecounter.getAllLowCalorieFoods();

	//	for(int i=0;i<lowCalorieFoods.size();i++)
//{
//	if(lowCalorieFoods.get(i) instanceof ReadyMeal)
//	{
//		System.out.println(lowCalorieFoods.get(i).);
//		}
//	
//}
		
	}

}
