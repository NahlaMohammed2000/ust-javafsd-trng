package com.ust;

public class Incrementeg {
	public static void main(String args[]) {
		byte a=126;
		//byte is 8 bit value
		System.out.println(a);
		a++;
		System.out.println(a);
		//it overflows here because byte can hold values  from -128 to 127
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
	}
}
