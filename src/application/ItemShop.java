package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.ShopOrder;
import entities.OrderItem;
import entities.ShopProduct;
import entities.enums.ShopOrderStatus;

public class ItemShop {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthOfDate = sdf.parse(sc.nextLine());
		
		Client client = new Client(clientName, clientEmail, clientBirthOfDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		ShopOrderStatus orderStatus = ShopOrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Date moment = new Date();
		ShopOrder order = new ShopOrder(moment, orderStatus, client);
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data:", i + 1);
			System.out.println();
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			Double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer prodQuantity = sc.nextInt();
			sc.nextLine();
			ShopProduct product = new ShopProduct(prodName, prodPrice);
			OrderItem item = new OrderItem(prodQuantity, product);
			order.addItem(item);
		}
			
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		System.out.println("Order items:");
		for (int j = 0; j < n; j++) {
			System.out.println(order.getItems().get(j).toString());;
		}
		
		System.out.print("Total price: " + "$" + order.total());

		sc.close();
	}
}