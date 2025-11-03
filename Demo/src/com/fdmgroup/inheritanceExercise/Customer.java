package com.fdmgroup.inheritanceExercise;

public  class Customer extends UserAccount{

	public Customer(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accessWebsite() {
		// TODO Auto-generated method stub
		
		System.out.println("accessing website as customer");
	}

}
