package com.fdmgroup.streamsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

		List<BankAccount> accounts = new ArrayList<>(
				Arrays.asList(account1, account2, account3, account4, account5, account6, account7, account8));

		System.out.println("----1.21---");

		Predicate<BankAccount> current = BankAccount -> BankAccount.getAccountType() == "current/checking";
		Long number1 = accounts.stream().filter(current).count();

		System.out.println("checking accounts are :" + number1);

		System.out.println("----1.22---");

		Predicate<BankAccount> overDrawn = BankAccount -> BankAccount.getBalance() < 0;
		Long number2 = accounts.stream().filter(overDrawn).count();
		System.out.println("overdrwan accounts in list are :" + number2);

		System.out.println("----1.23---");

		Comparator<Double> balance = Double::compare;
		Optional<Double> highestBalance = accounts.stream().map(BankAccount -> BankAccount.getBalance()).max(balance);
		System.out.println(highestBalance);

		System.out.println("----1.24---");
		Double averageBalance = accounts.stream().collect(Collectors.averagingDouble(BankAccount::getBalance));

		System.out.println("Average balance: " + averageBalance);

		System.out.println("----1.25---");

		OptionalDouble avergecredit = accounts.stream().filter(BankAccount -> BankAccount.getBalance() > 0)
				.mapToDouble(BankAccount -> BankAccount.getBalance()).average();

		System.out.println(avergecredit);

		System.out.println("----1.26---");

		double sumOfOverDrawn = accounts.stream().filter(BankAccount -> BankAccount.getBalance() < 0)
				.mapToDouble(BankAccount -> BankAccount.getBalance()).sum();

		System.out.println("total overDrawn : " + sumOfOverDrawn);

		System.out.println("----1.27---");

		double total = accounts.stream().filter(BankAccount -> BankAccount.getBalance() > 0)
				.mapToDouble(BankAccount -> BankAccount.getBalance() * BankAccount.getInterestRate()).sum();
		System.out.println("total interest to be paid : " + total);

		System.out.println("----1.31---");
		List<String> overdrawnNames = accounts.stream().filter(acc -> acc.getBalance() < 0)
				.map(BankAccount::getAccountHolder).collect(Collectors.toList());

		System.out.println(overdrawnNames);

		System.out.println("----1.32---");
		accounts.stream().filter(BankAccount -> BankAccount.getAccountType().equals("savings"))
				.forEach(BankAccount -> BankAccount.setInterestRate(1.3));

//		 accounts.stream()
//	        .filter(acc -> acc.getAccountType().equals("savings"))
//	        .forEach(acc -> System.out.println(acc.getInterestRate()));

		System.out.println("----1.33---");

		accounts.stream().filter(BankAccount -> BankAccount.getBankCode() == 234567)
				.forEach(BankAccount -> BankAccount.setBankCode(123456));

		accounts.stream().forEach(acc -> System.out.println(acc.getBankCode()));

		System.out.println("-------1.34-------");

		List<BankAccount> sameCode = accounts.stream().filter(BankAccount -> BankAccount.getBankCode() == 987654)
				.collect(Collectors.toList());
		System.out.println(sameCode);

		System.out.println("-------1.35-------");

		List<BankAccount> title = accounts.stream()
				.filter(BankAccount -> BankAccount.getAccountHolder().startsWith("Dr")).collect(Collectors.toList());

		System.out.println(title);

		System.out.println("-------1.41-------");
		Optional<BankAccount> HighestAccount = accounts.stream()
				.reduce((a1, a2) -> a1.getBalance() > a2.getBalance() ? a1 : a2);

		System.out.println(HighestAccount);

		System.out.println("-------1.42-------");

		Optional<BankAccount> lowestbalance = accounts.stream()
				.filter(BankAccount -> BankAccount.getBankCode() == 987654)
				.reduce((a1, a2) -> a1.getBalance() < a2.getBalance() ? a1 : a2);

		System.out.println(lowestbalance);

	}
}
