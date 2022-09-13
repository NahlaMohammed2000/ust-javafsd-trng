package Fifthset2.ust;

public class Thread6 implements Runnable {
	public static void main(String args[]) {
		Thread Thread_2=new Thread("Guru1");
		Thread Thread_3=new Thread("Guru2");
		Thread_2.start();
		Thread_3.start();
		System.out.println("Thread names are following:");
		System.out.println(Thread_2.getName());
		System.out.println(Thread_3.getName());
		}
	public void run() {
		
	}

}
