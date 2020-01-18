package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class BankAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		User account;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		String flag = sc.nextLine();
		
		if(flag.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double accBalance = sc.nextDouble();
			account = new User(accNumber, accHolder, accBalance);
		} else {
			account = new User(accNumber, accHolder);
		}
				
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account.toString());
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.print(account.toString());
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.print(account.toString());
		
		sc.close();
	}

}
