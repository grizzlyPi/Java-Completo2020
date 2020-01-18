package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeForm;

public class StaffDetails {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.print("How many employees will be registered? ");
		int length = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		List<EmployeeForm> list = new ArrayList<EmployeeForm>();
		
		for(int i = 0; i < length; i++) {
			System.out.printf("Employee #%d: ", i + 1);
			System.out.println();
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			list.add(new EmployeeForm(id, name, salary));
		
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int chooseId = sc.nextInt();
		sc.nextLine();
		
		for (int j = 0; j < list.size(); j++) {

			if(list.get(j).getId() == chooseId) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			System.out.println("List of employees: ");
			for (int k = 0; k < list.size(); k++) {
				if(list.get(k).getId() == chooseId) {
					list.get(k).addSalary(percent);
				}
				System.out.println(list.get(k).toString());
			}
			
		}else {
			System.out.println("This id does not exist!");
			System.out.println();
			System.out.println("List of employees: ");
			for (int k = 0; k < list.size(); k++) {
				System.out.println(list.get(k).toString());
			}
		}
		sc.close();
	}
}