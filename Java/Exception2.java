package fifthday.ust;
class SuperException{
	void display() {
		System.out.println("Display Test");
	}
}
public class Exception2 extends SuperException {
	public static void main(String args[]) {
		SuperException s=new SuperException();
		Exception2 s1=new Exception2();
		Exception2 e1= (Exception2) new SuperException();
	}
}
