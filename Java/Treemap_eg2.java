package coll.ust;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Treemap_eg2 {
	public static void main(String args[]) {
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of even numbers: "+evenNumbers);
		TreeMap<String,Integer>Numbers=new TreeMap<>();
		Numbers.put("One",1);
		Numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers: "+Numbers);
	}
}
