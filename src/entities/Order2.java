package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus2;

public class Order2 {
	private Date moment;
	private OrderStatus2 status;
	
	private Client client;
	
	List<OrderItem> items = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Order2() {
		
	}

	public Order2(Date moment, OrderStatus2 status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus2 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus2 status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	
	public void addItem(OrderItem item) {
		items.add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	@SuppressWarnings("null")
	public Double total() {
		Double sum = null;
		for(OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + sdf2.format(client.getBirthDate()) + ")" + " - " + client.getEmail() + "\n" );

		return sb.toString();
		
	}
}