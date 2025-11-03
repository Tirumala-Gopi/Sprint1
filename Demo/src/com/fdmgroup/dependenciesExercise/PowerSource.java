package com.fdmgroup.dependenciesExercise;

public class PowerSource {
	double watts;

	public double getWatts() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}

	public PowerSource(double watts) {
		super();
		this.watts = watts;
	}

	@Override
	public String toString() {
		return "PowerSource [watts=" + watts + "]";
	}
	public double supplyPower() {
	return watts;
		
	}

}
