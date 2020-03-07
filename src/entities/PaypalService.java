package entities;

public class PaypalService implements OnlinePaymentService {

	public PaypalService() {
	}
	
	@Override
	public Double quota(Double totalValue, int n, int i) {
		double quota = (totalValue/n) * (1.00 + 0.01 * i) * 1.02; 
		return quota;
	}
}