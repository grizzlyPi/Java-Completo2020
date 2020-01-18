package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RegisterForm;

public class Booking {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		RegisterForm[] vect = new RegisterForm[10];
		
		for(int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.printf("Rent # %d", i + 1 );
			System.out.println();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			vect[room] = new RegisterForm(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int j = 0; j < vect.length; j++) {
			
			if(vect[j] != null) {
				System.out.printf("%d: %s, %s", j, vect[j].getName(), vect[j].getMail());
				System.out.println();
			}
		}
		
		sc.close();
	}
}