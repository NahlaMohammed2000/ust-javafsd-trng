package lamda.ust;
@FunctionalInterface
interface MyInterface{
	double getPiValue();
}

public class Interfaceeg {
	public static void main(String[] args) {
		MyInterface ref;
		ref=()->3.1415;
		System.out.println("Value of Pi= "+ref.getPiValue());
	}
}
