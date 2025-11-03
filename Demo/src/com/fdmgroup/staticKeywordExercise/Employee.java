package com.fdmgroup.staticKeywordExercise;

public class Employee {
	
	private String name;
	private String jobTitle;
	private double hourlyWage;
	private static double minimumWage=17.5;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
				
		this.hourlyWage = hourlyWage;
		if(hourlyWage<minimumWage)
			System.out.println(minimumWage);
		else
			System.out.println(hourlyWage);
		
		
		
	}
	public static double getMinimumWage() {
		return minimumWage;
	}
	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}
	public Employee(String name, String jobTitle, double hourlyWage) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.hourlyWage = hourlyWage;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", hourlyWage=" + hourlyWage + "]";
	}
	
	

}
