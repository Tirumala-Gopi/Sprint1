package com.fdmgroup.castingExericse;

import java.util.ArrayList;

public class Basket {
	private ArrayList<BasketItem>basketItems;

	public ArrayList<BasketItem> getBasketItems() {
		return basketItems;
	}


	@Override
	public String toString() {
		return "Basket [basketItems=" + basketItems + "]";
	}

	public Basket() {
		super();
		this.basketItems = new ArrayList<>();
	}
	
	public void addItem(BasketItem basketItem)
	{
		basketItems.add(basketItem);
	}
	
	public void removeItem(BasketItem basketItem)
	{
		basketItems.remove(basketItem);
		
	}

//	public ArrayList<BasketItem>getAllItems()
//	{
//		return this.getAllItems();
//		
//	}
}
