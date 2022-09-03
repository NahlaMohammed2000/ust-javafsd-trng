package com.ust;

public class Final1 extends Super1{
	final int x=5;//cannot change value of x again
	int y;
	
	/**void display() {
		System.out.println("In final");
	}
	*/
	public static void main(String args[]) {
		Final1 s=new Final1();
		//s.x=7;
		s.y=10;
		System.out.println(s.z);
		s.display();
		
		
	}
	
}

class Super1{
	final int z=10;
	final void display() {
		System.out.println("in display");
	}
	void display(int x) {
		System.out.println("*");}

}

