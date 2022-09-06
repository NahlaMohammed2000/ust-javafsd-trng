package thirdday.ust;
class Animal
{
	protected String name;
	protected void display() {
		System.out.println("I m an animal");
	}
}
class Dog extends Animal{
	public void getInfo() {
		System.out.println("My name is "+name);
	}
}

public class Getinfo_eg {
	public static void main(String args[]) {
		Dog labrador=new Dog();
		labrador.name="Rocky";
		labrador.display();
		labrador.getInfo();
	}

}
