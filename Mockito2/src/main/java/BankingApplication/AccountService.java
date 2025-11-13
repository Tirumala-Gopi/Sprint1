package BankingApplication;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
	
	private AccountReader accountReader;
	private AccountWriter accountWriter;
	private List<account>accounts;
	public AccountService(AccountReader accountReader, AccountWriter accountWriter) {
		super();
		this.accountReader = accountReader;
		this.accountWriter = accountWriter;
		this.accounts = new ArrayList<>();
	}
	public AccountReader getAccountReader() {
		return accountReader;
	}
	public void setAccountReader(AccountReader accountReader) {
		this.accountReader = accountReader;
	}
	public AccountWriter getAccountWriter() {
		return accountWriter;
	}
	public void setAccountWriter(AccountWriter accountWriter) {
		this.accountWriter = accountWriter;
	}
	public List<account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "AccountService [accountReader=" + accountReader + ", accountWriter=" + accountWriter + ", accounts="
				+ accounts + "]";
	}
	
	
	public List<account> getAllAccounts()
	{
		return accounts=accountReader.findAll();
	}
	
	public void addAccount(account account) {
		accountWriter.add(account);
	}
	
	public void DeleteAccounts(account account) {
		accountWriter.deleteAll(account);
	}
	
	public void addAccounts(List<account> accounts) {
		
		for(account tempacc:accounts) {
			accountWriter.add(tempacc);
		}
	}

	public account getAccount(int id) {
		return accountReader.getAccount(id);
		
	}
}
