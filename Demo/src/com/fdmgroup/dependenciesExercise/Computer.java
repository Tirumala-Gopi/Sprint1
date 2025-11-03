package com.fdmgroup.dependenciesExercise;

public class Computer {
	private String MODEL;
	private HardDrive hardrive;
	private Memory memory;
	private Processor PROCESSOR;
	public Computer(String mODEL, HardDrive hardrive, Memory memory, Processor pROCESSOR) {
		super();
		MODEL = mODEL;
		this.hardrive = hardrive;
		this.memory = memory;
		PROCESSOR = pROCESSOR;
	}
	public String getMODEL() {
		return MODEL;
	}
	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}
	public HardDrive getHardrive() {
		return hardrive;
	}
	public void setHardrive(HardDrive hardrive) {
		this.hardrive = hardrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	public void setPROCESSOR(Processor pROCESSOR) {
		PROCESSOR = pROCESSOR;
	}
	public  void turnOn() {
		System.out.println("turnOn");
	}
	
	public  void turnOff() {
		System.out.println("turnOff");
	}
	@Override
	public String toString() {
		return "Computer [MODEL=" + MODEL + ", hardrive=" + hardrive + ", memory=" + memory + ", PROCESSOR=" + PROCESSOR
				+ "]";
	}
	public void getPower(PowerSource powerSource) {
		powerSource.supplyPower();
		System.out.println(powerSource+" watts received from power source ");
	}
	
}
