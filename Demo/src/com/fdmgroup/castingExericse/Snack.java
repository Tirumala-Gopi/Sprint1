package com.fdmgroup.castingExericse;

public class Snack implements BasketItem,FoodItem {
	
	private int fatContent;
	private int sugarContent;
	

	public int getFatContent() {
		return fatContent;
	}

	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	public Snack(int fatContent, int sugarContent) {
		super();
		this.fatContent = fatContent;
		this.sugarContent = sugarContent;
	}

	@Override
	public String toString() {
		return "Snack [fatContent=" + fatContent + ", sugarContent=" + sugarContent + "]";
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
