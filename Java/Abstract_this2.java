package thirdday.ust;

public class Abstract_this2 {
	int a;
	int b;
	
	Abstract_this2(){
		a=10;
		b=20;
	}
	
	Abstract_this2 get() {
		return this;
	}
	
	void display() {
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String args[]) {
		Abstract_this2 object=new Abstract_this2();
		object.get().display();
	}
}
