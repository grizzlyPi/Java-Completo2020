package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class IrsForm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Indvidual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			Double annualIncome = sc.nextDouble();
			
			if (ch == "i".charAt(0)) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
				
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		Double sum = 0.0;
		
		for (TaxPayer tp : list) {
			sum += tp.totalDue();
			System.out.println(tp.getName() + ": " + "$ " + String.format("%.2f", tp.totalDue()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "  + sum);
		sc.close();
	}
}