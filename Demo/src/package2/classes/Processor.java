package package2.classes;

public class Processor{
	
	private String MODEL;
	private double SPEED;
	private int NUMBER_OF_CORES;
	public String getMODEL() {
		return MODEL;
	}
	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}
	public double getSPEED() {
		return SPEED;
	}
	public void setSPEED(double sPEED) {
		SPEED = sPEED;
	}
	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	public void setNUMBER_OF_CORES(int nUMBER_OF_CORES) {
		NUMBER_OF_CORES = nUMBER_OF_CORES;
	}
	public Processor(String mODEL, double sPEED, int nUMBER_OF_CORES) {
		super();
		this.MODEL = mODEL;
		SPEED = sPEED;
		NUMBER_OF_CORES = nUMBER_OF_CORES;
	}
	public static void processData(String data) {}
	@Override
	public String toString() {
		return "Processor [MODEL=" + MODEL + ", SPEED=" + SPEED + ", NUMBER_OF_CORES=" + NUMBER_OF_CORES + "]";
	}
	
	
	
	
	
	
	
}

















