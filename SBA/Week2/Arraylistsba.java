package sbanew.ust;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistsba {
	public static void main(String args[]) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(101);numbers.add(102);numbers.add(103);numbers.add(104);numbers.add(105);numbers.add(106);
		numbers.add(108);numbers.add(109);numbers.add(110);numbers.add(111);numbers.add(112);numbers.add(113);
		numbers.add(114);numbers.add(115);numbers.add(116);numbers.add(117);numbers.add(118);numbers.add(119);
		numbers.add(120);
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Nahla");name.add("Rita");name.add("Jeeva");name.add("Arati");name.add("Meera");name.add("Kavya");
		name.add("Sree");name.add("Sruthi");name.add("Emma");name.add("Rachael");name.add("Anne");name.add("Anna");
		name.add("Ali");name.add("Leo");name.add("Lisna");name.add("Glory");name.add("Varun");name.add("Nima");name.add("Nino");
		name.add("Rahul");
		System.out.println("Employee id: "+numbers);
		Iterator<Integer>iterate=numbers.iterator();
		Iterator<String>iter=name.iterator();
		while(iterate.hasNext()) {
		System.out.println("employee "+iterate.next() +" "+iter.next());
		//System.out.println("employee name: "+iter.next());
		}
	}
}
