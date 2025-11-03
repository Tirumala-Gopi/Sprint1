package Package1;

	public class IndividualCustomer extends Customer {

	    public IndividualCustomer(String name, String licenseNumber) {
	        super(name, licenseNumber);
	    }

	    @Override
	    public double calculateTotal(int days, double dailyRate) {
	        double total = days * dailyRate;
	        return total * 0.95; // 5% discount
	    }

	    @Override
	    public String toString() {
	        return "IndividualCustomer - " + super.toString();
	    }
	}

