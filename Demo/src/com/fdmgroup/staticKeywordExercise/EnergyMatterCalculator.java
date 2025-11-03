package com.fdmgroup.staticKeywordExercise;

public class EnergyMatterCalculator {
	public static double SPEED_OF_LIGHT=299792458;
	 
	
	public static double matterToEnergy(double matter)
	{
		
		
		double C=EnergyMatterCalculator.SPEED_OF_LIGHT;
		double  energy=(matter*(C*C));
		return energy;
	
	}
	
	public static double energyToMatter(double energy)
	{
		double matter=(energy/(EnergyMatterCalculator.SPEED_OF_LIGHT*EnergyMatterCalculator.SPEED_OF_LIGHT));
	return matter;
	}
	
	

}
