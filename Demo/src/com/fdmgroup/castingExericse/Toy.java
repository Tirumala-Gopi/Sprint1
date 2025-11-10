package com.fdmgroup.castingExericse;

public class Toy implements BasketItem {
	
	private int minAge;
	private int maxAge;
	
	

	@Override
	public String toString() {
		return "Toy [minAge=" + minAge + ", maxAge=" + maxAge + "]";
	}

	public Toy(int minAge, int maxAge) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
	

}
