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
		 * Dentro de um m�todo ou de um bloco de inicializa��o est�tico,	*
		 * s� podemos acessar vari�veis ou outros m�todos est�ticos, e 		*
		 * para acessarmos membros n�o est�ticos precisamos ent�o criar uma * 
		 * inst�ncia da classe.											    *
		 ********************************************************************/
		
		/*********************************************************************
		 * Os membros est�ticos podem ser acessados diretamente na classe 	 *
		 * (voc� n�o precisa de uma inst�ncia de uma classe par se referir	 *
		 * a membros est�ticos).											 *
		 * � recomendado o uso de classes est�ticas para manter m�todos n�o  *
		 * associados com um objeto espec�fico.						 	 	 *
		 *********************************************************************/
		System.out.printf("Amount to be paid in reais = %.2f",
				CurrencyConverter.dollar(p, q));
		
		
		/*********************************************************************
		 * Os membros de inst�ncia s�o vari�veis e m�todos que voc� s� pode	 *
		 * acessar quando voc� tem uma inst�ncia de uma classe          	 *										 *
		 *********************************************************************/
		
		sc.close();
	}
	
}
