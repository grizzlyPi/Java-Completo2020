package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of the matrix (n x m): ");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println();
		System.out.print("Enter your matrix: ");
		System.out.println();
		
		/***********************************************************
		 * A matrix is a way to organize data in columns and rows. *
		 * A matrix is written inside brackets [ ][ ]. 			   *
		 * Each item in a matrix is called an entry.			   *
		 ***********************************************************/
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Choose a number in the matrix: " );
		int entry = sc.nextInt();
		System.out.println();
		System.out.println("**************");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				 if(mat[i][j] == entry) {
					 System.out.printf("Position %d, %d:", i, j);
					 System.out.println();
					 if(j != 0) {
						 System.out.print("Left: " + mat[i][j - 1]);
						 System.out.println();
					 }
					 if(j != m - 1) {
						 System.out.print("Right: " + mat[i][j + 1]);
						 System.out.println();
					 }
					 if(i != 0) {
						 System.out.print("Up: " + mat[i - 1][j]);
						 System.out.println();
					 }
					 if(i != n - 1) {
						 System.out.println("Down: " + mat[i + 1][j]);
						 System.out.println();
					 }
				 }	
			}	
		}
		sc.close();
	}
}