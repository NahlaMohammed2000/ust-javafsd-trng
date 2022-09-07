package coll.ust;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Collections {
	public static void main(String args[]) {
		List lst=new ArrayList();
		lst.add("abc");
		lst.add("123");
		lst.add(true);
		lst.add(3,4);
		Iterator itr=lst.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			if(obj instanceof String) {
				System.out.println(obj.toString().toUpperCase());
			}
			else {
				System.out.println(obj);
				}
		}
		
			
			/**if(itr.next() instanceof String)
			{
				System.out.println("****"+itr.next().toString().toUpperCase());
			}
			*/
		
		
		
		
	/**
		for(Object o:lst)
			System.out.println(o+"\n");
			System.out.println(lst);
	} */
}}
