package com.fdmgroup.dependenciesExercise;

import java.util.ArrayList;

public class ComputerStore {
	private String name;
	private ArrayList<Computer> computers=new ArrayList<>();

	public ComputerStore(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ComputerStore [name=" + name + ", computers=" + computers + "]";
	}
	public ComputerStore(String name, ArrayList<Computer> computers) {
		super();
		this.name = name;
		this.computers = computers;
	}
	
	public void ComputerStore(String name) {
		
	}
	public void addComputer(Computer computer) {
		computers.add(computer);
		
	}
	public  ArrayList<Computer> getAllComputers() {
		return computers;
	}

}
