package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentSet;

public class Instructor {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		Set<StudentSet> setA = new HashSet<>();
		Set<StudentSet> setB = new HashSet<>();
		Set<StudentSet> setC = new HashSet<>();
		
		System.out.print("How many student for course A? ");
		int nA = sc.nextInt();
		
		while(nA > 0) {
			setA.add(new StudentSet(sc.nextInt()));
			nA -= 1;
		}
		
		System.out.print("How many student for course B? ");
		int nB = sc.nextInt();
		
		while(nB > 0) {
			setB.add(new StudentSet(sc.nextInt()));
			nB -= 1;
		}
		
		System.out.print("How many student for course C? ");
		int nC = sc.nextInt();
		
		while(nC > 0) {
			setC.add(new StudentSet(sc.nextInt()));
			nC -= 1;
		}
		
		Set<StudentSet> setABC = new HashSet<>(setA);
		
		setABC.addAll(setB);
		setABC.addAll(setC);
		
		System.out.print("Total students: " + setABC.size());	
		
		sc.close();
	}
}