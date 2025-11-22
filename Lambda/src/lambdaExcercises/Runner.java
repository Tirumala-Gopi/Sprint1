package lambdaExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Runner {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
		BankAccount account2 = new BankAccount(87654321, 234567, "Mr J Jones", "current/checking", 0.2, 550);
		BankAccount account3 = new BankAccount(74639572, 946284, "Dr T Williams", "savings", 1.1, 4763.32);
		BankAccount account4 = new BankAccount(94715453, 987654, "Mr S Taylor", "savings", 1.1, 10598.01);
		BankAccount account5 = new BankAccount(16254385, 234567, "Mr P Brown", "current/checking", 0.2, -195.74);
		BankAccount account6 = new BankAccount(38776543, 234567, "Mr F Davies", "current/checking", 0.2, -503.47);
		BankAccount account7 = new BankAccount(87609802, 987654, "Mr B Wilson", "savings", 1.1, 2.5);
		BankAccount account8 = new BankAccount(56483769, 234567, "Dr E Evans", "current/checking", 0.2, -947.72);

		System.out.println("------implementing functional interfaces-----");

		Function<BankAccount, String> nameAndBalance = BankAccount -> BankAccount.getAccountHolder() + " : "
				+ BankAccount.getBalance();
		System.out.println(nameAndBalance.apply(account3));
		System.out.println(nameAndBalance.apply(account4));

		System.out.println("----2-----");

		Function<BankAccount, Double> interestDue = BankAccount -> BankAccount.getBalance()
				* BankAccount.getInterestRate() / 100;
		System.out.println(interestDue.apply(account2));

		System.out.println("-----3----");

		Function<BankAccount, Double> interest = BankAccount -> BankAccount.getBalance() > 0
				? BankAccount.getBalance() * BankAccount.getInterestRate() / 100
				: 0.0;
		System.out.println(interest.apply(account2));
		System.out.println(interest.apply(account8));

		System.out.println("-----4----");

		Predicate<BankAccount> accountType = BankAccount -> BankAccount.getAccountType() == "current/checking";
		System.out.println(accountType.test(account1));
		System.out.println(accountType.test(account6));

		System.out.println("-----5----");

		Predicate<BankAccount> overDrawn = BankAccount -> BankAccount.getBalance() < 0;
		System.out.println(overDrawn.test(account5));
		System.out.println(overDrawn.test(account7));

		System.out.println("-----6----");
		BinaryOperator<BankAccount> highestBalance = (BankAccount1,
				BankAccount2) -> BankAccount1.getBalance() > BankAccount2.getBalance() ? BankAccount1 : BankAccount2;
		System.out.println(highestBalance.apply(account3, account4));

		System.out.println("-----7----");
		Consumer<BankAccount> deduct = BankAccount -> System.out.println(BankAccount.getBalance() - 10);
		deduct.accept(account2);
		deduct.accept(account6);

		System.out.println("-----8----");
		BiConsumer<BankAccount, Integer> Deduct = (BankAccount, Integer) -> System.out
				.println(BankAccount.getBalance() - Integer);
		Deduct.accept(account1, 100);
		Deduct.accept(account5, 50);

		System.out.println("lambdas for list");

		List<BankAccount> bankAccounts = new ArrayList<>(
				Arrays.asList(account1, account2, account3, account4, account5, account6, account7, account8));

		bankAccounts.forEach(BankAccount -> System.out
				.println("number is " + BankAccount.getAccountNumber() + " of holder " + BankAccount.getAccountHolder()
						+ " type is " + BankAccount.getAccountType() + " and balance is " + BankAccount.getBalance()));

		System.out.println("----deducting 10--");
		// bankAccounts.forEach(deduct);

		System.out.println("----removing overdrawn--");

		// bankAccounts.removeIf(overDrawn.and((BankAccount -> BankAccount.getBalance()
		// < -500)));
		// System.out.println(bankAccounts);

		System.out.println("----removing saving acc-");
//		bankAccounts.removeIf(accountType.negate());
//		System.out.println(bankAccounts);

		System.out.println("----lambad for comparators-");
		Comparator<BankAccount> sortingByBalance = (BankAccount1, BankAccount2) -> Double
				.compare(BankAccount1.getBalance(), BankAccount2.getBalance());

		bankAccounts.sort(sortingByBalance);
		System.out.println(bankAccounts);

		System.out.println("----1.42----");

		Comparator<BankAccount> sortingByType = (a1, a2) -> a1.getAccountType().compareTo(a2.getAccountType());

		bankAccounts.sort(sortingByType);
		System.out.println(bankAccounts);

		System.out.println("----1.43----");

		Comparator<BankAccount> sortByAccountNumber = (a1, a2) -> Integer.compare(a1.getAccountNumber(),
				a2.getAccountNumber());
		bankAccounts.sort(sortByAccountNumber);
		System.out.println(bankAccounts);

		System.out.println("----1.44----");

		Comparator<BankAccount> combining = sortingByType.thenComparing(sortingByBalance);
		bankAccounts.sort(combining);
		System.out.println(bankAccounts);

		System.out.println("----lambdas for map.merge----");

		Map<Integer, Integer> bankCodeCount = new HashMap<>();

		BiFunction<Integer, Integer, Integer> addToCount = (currentValue, newValue) -> currentValue + newValue;
		for (BankAccount ba : bankAccounts) {
			bankCodeCount.merge(ba.getBankCode(), 1, addToCount);
		}

		System.out.println(bankCodeCount);

		System.out.println("-----1.53----");

		Map<Integer, Double> balanceCount = new HashMap<>();

		BiFunction<Double, Double, Double> addToBalance = (currentValue, newValue) -> currentValue + newValue;
		for (BankAccount ba : bankAccounts) {
			balanceCount.merge(ba.getBankCode(), ba.getBalance(), addToBalance);
		}

		System.out.println(balanceCount);

	}

}
