package lamda.ust;

interface Sayable1{
	void say1();
}

public class MethodReference3 {
	public static void saySomething() {
		System.out.println("Hello this is a static method");
	}
	public static void main(String[] args) {
		Sayable1 sayable=MethodReference3::saySomething;
		sayable.say1();
	}
}
