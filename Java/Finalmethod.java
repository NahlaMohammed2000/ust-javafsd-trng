package secondset.ust;
class FinalDemo{
	//final method
	public final void display10() {
		System.out.println("Final method");
	}
}
public class Finalmethod extends FinalDemo {
	public final void display10() {
		System.out.println("final method overridden");
	}
	public static void main(String args[]) {
		Finalmethod f=new Finalmethod();
		f.display10();
	}

}
