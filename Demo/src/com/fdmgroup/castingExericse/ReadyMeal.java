package com.fdmgroup.castingExericse;

public class ReadyMeal implements BasketItem,FoodItem {
	
	private String cuisineType;
	

	public ReadyMeal(String cuisineTyoe) {
		super();
		this.cuisineType = cuisineTyoe;
	}

	@Override
	public String toString() {
		return "ReadyMeal [cuisineTyoe=" + cuisineType + "]";
	}

	public String getCuisineTyoe() {
		return cuisineType;
	}

	public void setCuisineTyoe(String cuisineTyoe) {
		this.cuisineType = cuisineTyoe;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCalories(int calories) {
		// TODO Auto-generated method stub
		
	}

}
