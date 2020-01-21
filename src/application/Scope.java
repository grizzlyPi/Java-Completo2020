package application;

import entities.Function;

public class Scope {

	public static void main(String[] args) {
		
		// Both lifetime and scope should exist to access a variable
		
		/*************************
		* Class variable/ scope: *
		* Throughout the class.	 *
		**************************/
		// Until the end of the program
		String salute = "Hello!";
		Function beta = method();

		/*********************************************
		* Local variable/ scope: 					 *
		* Within the block in which it is declared.	 *
		**********************************************/
		// Until the control leaves the block in which it is declared
		if (true) {
			int counter = 1;
			counter += 1;
			System.out.println(counter);
			Function gama = new Function("def");
			System.out.println(gama);
		}
		
		/*************************************************
		 * Variable not in scope: alfa, gama and counter *
		 *************************************************/
		System.out.println(salute);	
		System.out.println(beta);
	
	}
	/************************************************* 
	 * Instance variable/ scope:					 *
	 * Throughout the class except in static methods.*
	 *************************************************/
	// Until the object is available in the memory
	static Function method() {
		Function alfa = new Function("abc");
		System.out.println(alfa);
		return alfa;
	}
}  