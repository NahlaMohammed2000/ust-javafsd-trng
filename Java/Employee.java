package com.ust;
import java.util.Scanner;

public class Employee {
	int empid;
	String Ename;
	float Salary;
	String Designation;
	String Location;
	
	//Overloading
	int Sal(int a) { 
		return a;
	}
	float Sal(float a) {
		return a;
	}
	//Overriding
	void Sal_1(int b) {
		System.out.println("Salary inside Employee: "+b);
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Employee e=new Employee();
		System.out.print("Enter empname:");
		String str=input.nextLine();
		System.out.print("empname:"+str);
		System.out.print("\n");
		System.out.print("Salary is:"+e.Sal(100.3f));
		
		
	}
}
class Engineer extends Employee{
	void Sal_1(int b) {
		System.out.print("Salary inside Engineer: "+b);
		
	}
	public static void main(String args[])
	{
		Engineer eng = new Engineer();
		Employee emp= new Employee();
		eng.Sal_1(200);
		emp.Sal_1(300);
	}
	
	
}

