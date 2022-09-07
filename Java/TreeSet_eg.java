package coll.ust;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
public class TreeSet_eg {
	public static void main(String args[]) {
		TreeSet<Integer>evenNumber=new TreeSet<>();
		evenNumber.add(2);
		evenNumber.add(5);
		evenNumber.add(6);
		System.out.println("TreeSet: "+evenNumber);
		Iterator<Integer>iterate=evenNumber.iterator();
		System.out.println("Treeset using iterator: ");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(",");
		}
	}
}
