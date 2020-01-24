package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus2;

public class Shop2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Order2 order = null;
		Product2 product;
		OrderItem item;
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birhtDate = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, birhtDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus2 status = OrderStatus2.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data:", i + 1);
			System.out.println();
			System.out.print("Product name: ");
			String name1 = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			product = new Product2(name1, price);
			item = new OrderItem(quantity, price, product);
			Date moment = new Date();
			order = new Order2(moment, status, client);
			order.addItem(item);
		}
			
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
