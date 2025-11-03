package package2.classes;

public class Memory {
	
	private String MODEL;
	private double CAPACITY;
	private double usedSpace;
	private double SPEED;
	
	
	public Memory(String mODEL, double cAPACITY, double usedSpace, double sPEED) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		this.usedSpace = usedSpace;
		SPEED = sPEED;
	}
	
	public static void storeData(String data) {}

	@Override
	public String toString() {
		return "Memory [MODEL=" + MODEL + ", CAPACITY=" + CAPACITY + ", usedSpace=" + usedSpace + ", SPEED=" + SPEED
				+ "]";
	}

	public Memory(String mODEL, double cAPACITY, double sPEED) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		SPEED = sPEED;
	}
	
	
}