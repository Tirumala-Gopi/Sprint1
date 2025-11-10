package com.fdmgroup.castingExericse;

import java.util.ArrayList;



public class CalorieCounter {
	
	private ArrayList<FoodItem>lowCalorieFoods;

	public ArrayList<FoodItem> getLowCalorieFoods() {
		return lowCalorieFoods;
	}

	@Override
	public String toString() {
		return "CalorieCounter [lowCalorieFoods=" + lowCalorieFoods + "]";
	}

	public CalorieCounter() {
		super();
		this.lowCalorieFoods = new ArrayList<>();
		
	}
	

	public void addLowCalorieFood(FoodItem foodItem)
	
	{
		int c=foodItem.getCalories();
		
		if(c<=500)
		{
			
			lowCalorieFoods.add(foodItem);
			
		}
		
		
	}
	public ArrayList<FoodItem>getAllLowCalorieFoods()
	{
	
		
		for(int i=0;i<lowCalorieFoods.size();i++)
		{
			System.out.println(lowCalorieFoods.get(i).getCalories());
			 
			System.out.println(lowCalorieFoods.get(i).getCalories()+" of "+lowCalorieFoods.get(i));
		}
			return null;
	
}
}