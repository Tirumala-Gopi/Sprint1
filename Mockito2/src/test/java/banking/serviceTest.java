package banking;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import BankingApplication.AccountReader;
import BankingApplication.AccountService;
import BankingApplication.AccountWriter;
import BankingApplication.account;

@ExtendWith(MockitoExtension.class)

class serviceTest {

	@Mock
	private AccountReader mockAccountReader;

	@Mock
	private AccountWriter mockAccountWriter;

	@Mock
	private List<account> mockaccounts;

	private AccountService account1;

	@BeforeEach
	void setUp() {
		account1 = new AccountService(mockAccountReader, mockAccountWriter);

	}

	@Test
	void test2() {
		account1.getAllAccounts();
		verify(mockAccountReader).findAll();
	}

	@Test
	void test3() {
		when(mockAccountReader.findAll()).thenReturn(mockaccounts);

		assertEquals(account1.getAllAccounts(), mockaccounts);
	}
	
	
	
	@Test
	void test4(){
		
		account newAccount=new account(2,4,6.6);
		account1.addAccount(newAccount);
		verify(mockAccountWriter).add(newAccount);
		
		
	}
	
	@Test
	void test5() {
		account Account1=new account(2,4,6.6);
		account Account2=new account(1,1,1.1);
		List<account> accounts=new ArrayList<>();
		accounts.add(Account2);
		accounts.add(Account1);
		account1.addAccounts(accounts);
		verify(mockAccountWriter,times(2)).add(any(account.class));
		
	}
	
	@Test
	void test6() {
		
		account1.getAccount(2);
		
		verify(mockAccountReader).getAccount(2);
		
		account Account2=new account(1,1,1.1);
		when(mockAccountReader.getAccount(1)).thenReturn(Account2);
		
		assertEquals(Account2,account1.getAccount(1));
	}
	
	@Test
	void test7() {
		account Account2=new account(1,1,1.1);
		account1.DeleteAccounts(Account2);
		verify(mockAccountWriter).deleteAll(Account2);
	}

}
