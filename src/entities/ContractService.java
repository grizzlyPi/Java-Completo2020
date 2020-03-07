package entities;

import java.util.Calendar;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	static Calendar cal = Calendar.getInstance();
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processInstallment(Contract contract, int n) {		
		for(int i = 1; i <= n; i ++) {
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Double quota = onlinePaymentService.quota(contract.getTotalValue(), n, i);
			contract.getInstallment().add(new Installment(cal.getTime(), quota));
		}
	}
}