package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private ShopProduct product;
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R - - - - - - - - - -    
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, ShopProduct product) {
		this.quantity = quantity;
		this.product = product;
	}

	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ShopProduct getProduct() {
		return product;
	}

	public void setProduct(ShopProduct product) {
		this.product = product;
	}

	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Double subTotal() {
		return quantity * product.getPrice();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append("$" + product.getPrice() + ", ");
		sb.append("Quantity: " + quantity + ", ");
		sb.append("Subtotal: " + "$" + subTotal());
		return sb.toString();			
		}
	}