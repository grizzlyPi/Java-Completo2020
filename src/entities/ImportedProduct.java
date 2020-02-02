package entities;

public class ImportedProduct extends InheritanceProduct {

	private Double customsFee;
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R S - - - - - - - - - -  
	// - - - - - - - -  O V E R L O A D I N G  - - - - - - - - - -   
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return  super.getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (" 
				+ "Customs fee: "
				+ "$ "
				+ String.format("%.2f", customsFee)
				+ ")";	
		}
}