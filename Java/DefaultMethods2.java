package Optional;
interface Sayable3{
	//default
	default void say3() {
		System.out.println("Hello this a default method");
	}
	//abstractct
	void sayMore(String msg);
	//static
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
	
}

public class DefaultMethods2 implements Sayable3 {
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethods2 dm=new DefaultMethods2();
		dm.say3();
		dm.sayMore("Work is worship");
		Sayable3.sayLouder("Hellooo");
}
}
