package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentGradeCheck {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		student = new Student();
		
		System.out.print("Enter student's name:  ");
		student.name = sc.nextLine();
		
		System.out.print("Enter first score:  ");
		student.firstScore = sc.nextDouble();
		
		System.out.print("Enter second score:  ");
		student.secondScore = sc.nextDouble();
		
		System.out.print("Enter third score:  ");
		student.thirdScore = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		System.out.println(student.passFail());
		
		if(student.passFail() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS", 60.0 - student.finalGrade());
		}
		
		sc.close();
	}

}
