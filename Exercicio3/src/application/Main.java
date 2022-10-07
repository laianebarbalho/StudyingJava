package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter the grade1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.println("Enter the grade2: ");
		student.grade2 = sc.nextDouble();

		System.out.println("Enter the grade3: ");
		student.grade3= sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSIG %.2f POINTS%n", student.missingPoings());
		} else {
			System.out.println("PASS");
		}
		sc.close();				
	}

}
