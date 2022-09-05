package secondset.ust;
class Animal3{
	Animal3(){
		System.out.println("I m an animal");
	}
}
class Dog3 extends Animal3{
	Dog3(){
		super();
		System.out.println("I m a dog");
		
	}
}
public class Superfunction {
	public static void main(String[] args) {
		Dog3 dog1 =new Dog3();
	}
	
}
