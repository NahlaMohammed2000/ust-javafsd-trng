package thirdday.ust;
interface Polygon{
void getArea();
	
	//default method
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}
}

class Rectangle implements Polygon{
	public void getArea() {
		int length=6;
		int breadth=5;
		int area=length*breadth;
		System.out.println("Area of rectangle is "+area);
	}
	public void getSides() {
		System.out.println("I have 4 sides");
	}
}
public class Polygons_eg implements Polygon{
	public void getArea() {
		int length=5;
		int area=length*length;
		System.out.println("The area of the square is"+area);
	}
	
}
