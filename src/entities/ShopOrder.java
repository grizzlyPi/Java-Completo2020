package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.ShopOrderStatus;

public class ShopOrder {
	private Date moment;
	private ShopOrderStatus status;
	
	private Client client;
	
	List<OrderItem> items = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R - - - - - - - - - -    
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public ShopOrder() {
		
	}

	public ShopOrder(Date moment, ShopOrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public ShopOrderStatus getStatus() {
		return status;
	}

	public void setStatus(ShopOrderStatus status) {
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

	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public void addItem(OrderItem item) {
		items.add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(int i = 0; i < items.size(); i++) {
			sum = sum + items.get(i).subTotal();
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