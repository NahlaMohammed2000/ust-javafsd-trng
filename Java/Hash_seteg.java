package coll.ust;
import java.util.HashSet;

public class Hash_seteg {
	public static void main(String[] args) {
		HashSet<Integer>evenNumber=new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet: "+evenNumber);
		HashSet<Integer>Number=new HashSet<>();
		Number.addAll(evenNumber);
		Number.add(5);
		System.out.println("New HashSet: "+Number);
		
	}
}
