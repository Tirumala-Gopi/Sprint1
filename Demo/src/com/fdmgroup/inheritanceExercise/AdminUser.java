package com.fdmgroup.inheritanceExercise;

public class AdminUser extends UserAccount {

	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accessWebsite() {
		System.out.println("accessing website with admin rights");
		
		
	}

}
