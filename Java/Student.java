package com.ust;
//firstName, billOfThePatient
public class Student {
int sID;
String name;
int age; //instance variables are assigned default value 0
String course;
static int count;//value of count will be same since static variable

//public Student() {
	//Constructors dont have return type
//}

{
int z;
System.out.println(z=7);
}
//in the output block statments get executed first




public static void main(String args[]) {
	float f=12.45f;
	int x=5;
	String str;
	Student s = new Student();    //Default constructor/zero arg constructor
	Student s1 = new Student(); 
	Student s2 = new Student(); 
	s.age=22;
System.out.println(s.age);
System.out.println(x);
s.count=15;
s1.age=25;
System.out.println(s1.age);
System.out.println(s.count);
System.out.println(s1.count);//since count is global variable

}
}
