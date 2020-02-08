package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();	
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double totalDue() {
		Double total;
		if (super.getAnnualIncome() < 20000) {
			total = super.getAnnualIncome() * 0.15 - 0.5 * healthExpenditures;	
		} else {
			total = super.getAnnualIncome() * 0.25 - 0.5 * healthExpenditures;
		}
		
		return total;
	}
}