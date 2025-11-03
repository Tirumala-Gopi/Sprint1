package dependenciesExercise2;

public class SmartDevice {

	private String model;
	private double poweusage;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPoweusage() {
		return poweusage;
	}
	public void setPoweusage(double poweusage) {
		this.poweusage = poweusage;
	}
	public SmartDevice(String model, double poweusage) {
		super();
		this.model = model;
		this.poweusage = poweusage;
	}
	@Override
	public String toString() {
		return "SmartDevice [model=" + model + ", poweusage=" + poweusage + "]";
	}
	public void activate() 
	{
		System.out.println("activated");
	}
	public void deactivate()
	{
		System.out.println("deactivated");
	}
}
