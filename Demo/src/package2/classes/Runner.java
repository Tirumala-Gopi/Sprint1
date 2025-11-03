package package2.classes;

public class Runner {
	
	public static void main(String[] args) {
		HardDrive drive1=new HardDrive("Seagate",2.0,0.0);
		HardDrive drive2=new HardDrive("Dell",3.0,500.0);
		
		Processor processor1=new Processor("Intel Xeon",2.93,6);
		Processor processor2=new Processor("Intel Celeron",2.9,2);
		
		Memory memory1=new Memory("Kingston",4.0,1600.0);
		Memory memory2=new Memory("Corsair",8.0,1333.0);
		System.out.println(drive1);
		System.out.println(drive2);
		System.out.println(processor1);
		System.out.println(processor2);
		System.out.println(memory1);
		System.out.println(memory2);
		
		drive1.setUsedSpace(50);
		System.out.println(drive1.getUsedSpace());
		
	}
	
	
	

}
