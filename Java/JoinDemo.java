package Fifthset2.ust;

public class JoinDemo implements Runnable {
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		System.out.println("Is Alive?"+t.isAlive());
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new JoinDemo());
		t1.start();
		t1.join(1000);
		System.out.println("\nJoining after 1000"+"milliseconds:\n");
		System.out.println("Current thread: "+t1.getName());
		System.out.println("Is alive?"+t1.isAlive());

	}

}
