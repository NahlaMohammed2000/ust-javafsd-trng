package secondset.ust;
class Animal4{
	Animal4(){
		System.out.println("I m an animal");
	}
	Animal4(String type){
		System.out.println("Type: "+type);
	}
}
class Dog4 extends Animal4{
	Dog4(){
		super("Animal");
		System.out.println("I m a dog");
	}
}

public class Superparameter {
	public static void main(String[] args) {
		Dog4 dog1 = new Dog4();
	}

}
