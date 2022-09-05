package secondset.ust;
class Animal1{
	public void display() {
		System.out.println("I m an animal");
	}
}
class Dog1 extends Animal1{
	//overriding method
	public void display() {
		System.out.println("I m a dog");
	}
	public void printMessage(){
		display();
		super.display();
	}
}
public class Withsuper {
	public static void main(String args[]) {
		Dog1 dog1=new Dog1();
		dog1.printMessage();
	}

}
