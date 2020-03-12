package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Votes {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		Map<String, Integer> map = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer value = Integer.parseInt(fields[1]);
				map.put(name, map.get(name) == null? value:map.get(name) + value);
				line = br.readLine();
			}
			
			for(String s : map.keySet()) {
				System.out.println(s + ": " + map.get(s));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();		
	}
}