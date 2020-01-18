package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Shop {

	public static void main(String[] args) {

	Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);
	
	OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
	OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
	
	System.out.println(order);
	System.out.println(os1);
	System.out.println(os2);
	
	}
}
