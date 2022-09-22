package Optional;

interface Sayable2{
	//Default method
	default void say2() {
		System.out.println("Default method");
	}
}

public class DefaultMethods implements Sayable2{
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say2();
		dm.sayMore("Work is worship");
	}

}
