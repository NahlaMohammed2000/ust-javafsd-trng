package com.ust;

public class Switch_example {
	public static void main(String args[]) {
		String str="Green";
		switch(str) {
		case "Red":
			System.out.println("in red");
			System.out.println("***");
			break;
		default:
			System.out.println("default");
			break;
		case "Green":
			System.out.println("in green");
			System.out.println("***");
			break;
		case "Yellow":
			System.out.println("in yellow");
			System.out.println("***");
			break;
		case "Orange":
			System.out.println("in red");
			System.out.println("***");
			break;
		
		}
	}
}
