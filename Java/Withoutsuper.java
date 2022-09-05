package secondset.ust;
class Animal{
	public void display() {
		System.out.println("I m an animal");
	}
}
class Dog extends Animal{
	//overriding method
	public void display() {
		System.out.println("I m a dog");
	}
	public void printMessage(){
		display();
	}
}
public class Withoutsuper {
	public static void main(String args[]) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}
}
