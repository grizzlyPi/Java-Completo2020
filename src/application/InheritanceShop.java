package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.InheritanceProduct;
import entities.UsedProduct;

public class InheritanceShop {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<InheritanceProduct> prod = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n ; i++) {
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			if (ch == "i".charAt(0)) {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
			/**********************************************************************************************************
			 * Upcasting is casting a subtype to a supertype, upward to the inheritance tree. 
			 * Here, we cast the 'ImportedProduct' type to the 'InheritanceProduct' type. 
			 * Because 'InheritanceProduct' is the supertype of 'ImportedProduct', this casting is called upcasting.
			 * Note that the actual object type does not change because of casting. 
			 * The'ImportedProduct' object is still a 'ImportedProduct' object. Only the reference type gets changed.
			 **********************************************************************************************************/
				prod.add(new ImportedProduct(name, price, customsFee));

			/*********************************************************************************************************
			 * If we want to invoke subclass’s method then we will need to downcast the object but we can run into 
			 * ClassCastException so, if you want to avoid this exception you can use a keyword 'instanceof' 
			 * which will check the runtime type of the object before we cast the object as in below code.
			 *********************************************************************************************************/
				//InheritanceProduct up = new ImportedProduct(name, price, customsFee);
				//if (up instanceof ImportedProduct) {
				//	ImportedProduct down = (ImportedProduct) up;
				//	System.out.print(down.totalPrice())}

				
			}else if (ch == "u".charAt(0)){
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.nextLine());
				prod.add(new UsedProduct(name, price, manufactureDate));
				
			}else {
				prod.add(new InheritanceProduct(name, price));
			}	
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (InheritanceProduct x : prod) {
			System.out.println(x.priceTag());
		}
		sc.close();
	}
}