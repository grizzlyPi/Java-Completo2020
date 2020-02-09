package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.exceptions.ReservationException;

public class BookingExample {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.nextLine());
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
			System.out.println();
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.nextLine());
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
		}
		
		catch(ParseException e){
			System.out.println("Invalid input date format of value (dd/MM/yyyy)");	
		}
		catch(ReservationException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input.");
		}
		sc.close();
	}
}