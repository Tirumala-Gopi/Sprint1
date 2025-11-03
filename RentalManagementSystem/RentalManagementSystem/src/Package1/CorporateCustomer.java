package Package1;

	public class CorporateCustomer extends Customer {

	    public CorporateCustomer(String name, String licenseNumber) {
	        super(name, licenseNumber);
	    }

	    @Override
	    public double calculateTotal(int days, double dailyRate) {
	        double total = days * dailyRate;
	        return total * 0.90; // 10% discount
	    }

	    @Override
	    public String toString() {
	        return "CorporateCustomer - " + super.toString();
	    }
	}