package package2.classes;

public class HardDrive {
	


	private	String MODEL;
	private double CAPACITY;
	private double usedSpace;
	

	public String getMODEL() {
		return MODEL;
	}


	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}


	public double getCAPACITY() {
		return CAPACITY;
	}


	public void setCAPACITY(double cAPACITY) {
		CAPACITY = cAPACITY;
	}


	public double getUsedSpace() {
		return usedSpace;
	}


	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}


	public HardDrive(String mODEL, double cAPACITY, double usedSpace) {
		super();
		MODEL = mODEL;
		CAPACITY = cAPACITY;
		this.usedSpace = usedSpace;
	}

public static String readData(String file) {
	
	return "";
	
}
public static void writeData(String data,String file) {
	
}




@Override
public String toString() {
	return "HardDrive [MODEL=" + MODEL + ", CAPACITY=" + CAPACITY + ", usedSpace=" + usedSpace + "]";
}


}
