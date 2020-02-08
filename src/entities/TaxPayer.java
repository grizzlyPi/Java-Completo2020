package entities;

public abstract class TaxPayer {
	private String name;
	private Double annualIncome;
	
	/*************************************************************************************************************
	 * An abstract class is a class that is declared abstract —it may or may not include abstract methods. 
	 * Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed, 
	 * the subclass usually provides implementations for all of the abstract methods in its parent class.
	 *************************************************************************************************************/
	
	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R S - - - - - - - - - -  
	// - - - - - - - -  O V E R L O A D I N G  - - - - - - - - - -   
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.annualIncome = anualIncome;
	}

	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double anualIncome) {
		this.annualIncome = anualIncome;
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	// - - - - - -  O R D I N A R Y   M E T H O D S  - - - - - - - 
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public abstract Double totalDue();
	
}