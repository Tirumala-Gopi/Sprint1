package com.fdmgroup.castingExericse;

public class Laptop implements BasketItem {
	
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	

	@Override
	public String toString() {
		return "Laptop [cpuSpeed=" + cpuSpeed + ", memory=" + memory + ", hardDrive=" + hardDrive + "]";
	}

	public Laptop(double cpuSpeed, double memory, double hardDrive) {
		super();
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
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
