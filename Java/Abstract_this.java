package thirdday.ust;

public class Abstract_this {
	int a;
	int b;
	
	Abstract_this(){
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	
	Abstract_this(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Inside parametrised constructor");
	}
		
	public static void main(String args[]) {
		Abstract_this object=new Abstract_this();
	
	}
	
	
}
