package BankingApplication;

import java.util.List;

public interface AccountReader {

	public List<account>findAll();
	public account getAccount(int id);
	
	
}
