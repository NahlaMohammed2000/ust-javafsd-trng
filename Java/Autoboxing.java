package thirdday.ust;
import java.io.*;

public class Autoboxing {
	public static void main(String args[]) {
		Integer i=new Integer(10);
		//unboxing object
		int i1=i;
		System.out.println("Value of i: "+i);
		System.out.println("Value of i: "+i1);
		//autoboxing of character
		Character X='a';
		//auto-unboxing of character
		char ch=X;
		System.out.println("Value of ch: "+ch);
		System.out.println("Value of X: "+X);
	}

}
