package sbanew.ust;

interface Employee1{
	 public abstract void CalculateSalary1();
	 public abstract void fetchDepartment1();

}

 class Engineer1 implements Employee1{
	public void CalculateSalary1() {
	System.out.println("Inside Salary method in Engineer");
}
public void fetchDepartment1()
{
	System.out.println("Inside department method in Engineer");
	}
	 
}

 class Doctor1 implements Employee1{
	public void CalculateSalary1()
	{
			System.out.println("Inside Salary method in Doctor");
			}
	
	public void fetchDepartment1()
{
		System.out.println("Inside department method in Doctor");
		}
}
public class Interface_example {
	 public static void main(String args[]) {
		 Engineer1 e=new Engineer1();
		 Doctor1 d=new Doctor1();
		 e.CalculateSalary1();
		 e.fetchDepartment1();
		 d.CalculateSalary1();
		 d.fetchDepartment1();
	
}}
	
