package sbanew.ust;
abstract class Employee{
	float Salary;
	String Dept;
	abstract public void CalculateSalary();
	abstract public void fetchDepartment();
}
class Engineer extends Employee{
	public void CalculateSalary()
{
		System.out.println("Inside Salary method in Engineer");
		}
	public void fetchDepartment()
	{
			System.out.println("Inside department method in Engineer");
			}
}
class Doctor extends Employee{
	public void CalculateSalary()
	{
			System.out.println("Inside Salary method in Doctor");
			}
	
	public void fetchDepartment()
{
		System.out.println("Inside department method in Doctor");
		}
}


 public class Abstractionnew {
	 public static void main(String args[]) {
		 Engineer e=new Engineer();
		 Doctor d=new Doctor();
		 e.CalculateSalary();
		 e.fetchDepartment();
		 d.CalculateSalary();
		 d.fetchDepartment();
		 
		 
	 }
	 
	 

}
