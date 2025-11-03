package Library_and_Member_ManagementSystem;

public class Faculty extends Member {
	
	private String subject;

	public Faculty(String name, String email, String subject) {
		super(name, email);
		this.subject=subject;
	}
	
	public Faculty(String name, String email) {
		super(name, email);
		
	}

	@Override
	public void chargePenalty(double amount) {

		double newBalance=super.getBalance()-amount/2;
		this.setBalance(newBalance);
		
		
	}

	@Override
	public String toString() {
		return "Faculty ["+super.toString()+"subject=" + subject + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
