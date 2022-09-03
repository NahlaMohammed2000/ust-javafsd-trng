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
	void Sal_1() {
		System.out.println("\n Inside Employee class");
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
		Engineer eng = new Engineer();
		Employee emp= new Employee();
		eng.Sal_1();
		emp.Sal_1();
		
	}
}
//inheritance
class Engineer extends Employee{
	void Sal_1() {
		super.Sal_1(); //calling overridden function
		System.out.println("Inside engineer class");
	}
	
}

