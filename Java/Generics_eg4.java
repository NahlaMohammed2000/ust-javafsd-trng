package fourthday.ust;
class GenericsClass1 <T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}
public class Generics_eg4 {
	public static void main(String args[]) {
		//GenericsClass1<String>obj=new GenericsClass1<>();
		GenericsClass1<Float>obj1=new GenericsClass1<>();
		obj1.display();
	}
}
