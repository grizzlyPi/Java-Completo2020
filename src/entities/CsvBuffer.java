package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CsvBuffer {

	public static ArrayList<String> resume(File path) {
		ArrayList<String> tags = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path.getPath()))){
			String line = br.readLine();
			while(line != null) {
				 String[] word = line.split(";");
				 String tag = word[0] + ", " + Double.parseDouble(word[1]) * Double.parseDouble(word[2]);
				 tags.add(tag);
				 line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		return tags;
	}
	
	public static boolean writer(ArrayList<String> tags, File path) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out.csv"))){
			for(String tag : tags) {
				bw.write(tag);
				bw.newLine();
			}
			return true;
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return false;
	}
}