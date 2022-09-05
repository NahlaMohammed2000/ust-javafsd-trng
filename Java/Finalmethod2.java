package secondset.ust;
final class FinalClass{
	public void display() {
		System.out.println("Final method");
	}
}
public class Finalmethod2 extends FinalClass {
	public void display() {
		System.out.println("final method overridden");
	}
	public static void main(String args[]) {
		Finalmethod2 f=new Finalmethod2();
		f.display();
	}
	
}
