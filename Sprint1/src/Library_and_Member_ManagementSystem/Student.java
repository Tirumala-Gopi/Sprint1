package Library_and_Member_ManagementSystem;

public class Student extends Member {
	
	private int Clas;

	
	@Override
	public void chargePenalty(double amount) {
		double newBalance=super.getBalance()-amount;
		this.setBalance(newBalance);
		
		
	}

	public Student(String name, String email, int Clas) {
		super(name, email);
		this.Clas = Clas;
	}
	
	public Student(String name, String email) {
		super(name, email);
		
	}



	public int getClas() {
		return Clas;
	}

	public void setClass(int clas) {
		this.Clas = clas;
	}

	@Override
	public String toString() {
		return "Student ["+super.toString()+"Class=" + Clas + "]";
	}
	
	
	
	

}
