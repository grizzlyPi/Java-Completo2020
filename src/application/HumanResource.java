package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class HumanResource {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double workerSalary = sc.nextDouble();
		
		/**********************************************************************************************
		 * A variável 'worker' é um ponteiro no 'stack' para o objeto da classe 'Worker' no 'heap'.	  *
		 * A variável 'department' é um ponteiro criado no momento da instanciação da classe 'Worker' *
		 * para o objeto da classe 'Department'.  													  *	
		 * A variável 'contracts' é um ponteiro criado no momento da instanciação da classe 'Worker'  *
		 * para o objeto vazio da classe 'ArrayList'.												  *														                  *   
		 **********************************************************************************************/
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i ++) {
			System.out.printf("Enter contract #%d data:", i + 1);
			System.out.println();
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
		/****************************************************************************************************
		 * A variável 'contract' é um ponteiro no 'stack' para o objeto da classe 'HourContract' no 'heap'.	*
		 ****************************************************************************************************/
		HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
		/*********************************************************************************
		 * O método '.addContract' copia o ponteiro 'contract' para a lista 'contracts'	 * 		
		 *********************************************************************************/
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		Integer month = Integer.parseInt(monthAndYear.substring(0,2));
		Integer year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %s", monthAndYear, String.format("%.2f", worker.income(year, month)));

		sc.close();

	}

}