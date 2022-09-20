package lamda.ust;
@FunctionalInterface
interface sayable{
	void say(String msg);//abstract method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceExample2 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie=new FunctionalInterfaceExample2();
		fie.say("Hello there");
	}

}
