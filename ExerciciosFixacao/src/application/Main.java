package application;

import java.util.Locale;
import java.util.Scanner;

import pessoa.Employee;

/*Fazer um programa para ler os dados de um funcionario(nome, salario bruto e imposto). 
Em seguida, mostrar os dados do funcionario(nome e salario liquido). 
Em seguida, aumentar o salario do funcionario com base em uma porcentagem dada(somente o salario bruto é
 afetado pela porcentagem) e
 mostrar novamente os dados do funcionário.*/


public class Main {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Employee emp = new Employee();
	
	System.out.println("Name: ");
	emp.name = sc.nextLine();
	
	System.out.println("Gross salary: ");
	emp.grossSalary = sc.nextDouble();
	
	System.out.println("Tax: ");
	emp.tax = sc.nextDouble();
	
	System.out.println(emp.toString());
	
	System.out.println("Which percentage to increase salary?");
	double percentage = sc.nextDouble();
	emp.increaseSalary(percentage);
	
	System.out.println();
	System.out.println("Updated data: " + emp);
	
	sc.close();
	
	
}
}
