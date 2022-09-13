package Fifthset2.ust;

public class Thread2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r =new Thread2();
		r.run();
		
	}
	public void run() {
		System.out.println("implementation of runnable");
	}
}
