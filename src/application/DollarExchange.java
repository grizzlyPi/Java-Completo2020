package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.CurrencyConverter;

public class DollarExchange {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p, q;
		System.out.print("What is the dollar price? ");
		p = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		q = sc.nextDouble();
		
		/********************************************************************
		 * Dentro de um método ou de um bloco de inicialização estático,	*
		 * só podemos acessar variáveis ou outros métodos estáticos, e 		*
		 * para acessarmos membros não estáticos precisamos então criar uma * 
		 * instância da classe.											    *
		 ********************************************************************/
		
		/*********************************************************************
		 * Os membros estáticos podem ser acessados diretamente na classe 	 *
		 * (você não precisa de uma instância de uma classe par se referir	 *
		 * a membros estáticos).											 *
		 * É recomendado o uso de classes estáticas para manter métodos não  *
		 * associados com um objeto específico.						 	 	 *
		 *********************************************************************/
		System.out.printf("Amount to be paid in reais = %.2f",
				CurrencyConverter.dollar(p, q));
		
		
		/*********************************************************************
		 * Os membros de instância são variáveis e métodos que você só pode	 *
		 * acessar quando você tem uma instância de uma classe          	 *										 *
		 *********************************************************************/
		
		sc.close();
	}
	
}
