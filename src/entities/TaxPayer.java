package entities;

public abstract class TaxPayer {
	private String name;
	private Double annualIncome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.annualIncome = anualIncome;
	}

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
	
	
	public abstract Double totalDue();
	
}
