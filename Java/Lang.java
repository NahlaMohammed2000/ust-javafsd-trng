package coll.ust;
import java.util.ArrayList;

public class Lang {
	public static void main(String[] args) {
		ArrayList<String>languages=new ArrayList<>();
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		System.out.println("ArrayList: "+languages);
		languages.set(2,"JavaScript");
		System.out.println("Modified ArrayList: "+languages);
	}
}
