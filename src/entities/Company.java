package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double totalDue() {
		Double total;
		if(numberOfEmployees > 10) {
			total= super.getAnnualIncome() * 0.14;
		} else {
			total = super.getAnnualIncome() * 0.16;
		}
		
		return total;
	}
}