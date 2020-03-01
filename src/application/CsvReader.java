package application;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.CsvBuffer;

public class CsvReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		ArrayList<String> tags = new ArrayList<>();
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		tags = CsvBuffer.resume(path);
		System.out.println("Preview: ");
		
		for(String tag : tags) {
			System.out.println(tag);
		}	
		
		System.out.println("-".repeat(25));

		if(CsvBuffer.writer(tags, path)) {
			System.out.println("Directory created successfully: " + path.getParent() + "\\out.csv");
		}
		
		sc.close();
	}
}