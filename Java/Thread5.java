package Fifthset2.ust;

public class Thread5 implements Runnable {
	public void run() {}
	public static void main(String args[]) {
			Thread thread_1=new Thread();
			thread_1.start();
			try {
				thread_1.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			thread_1.setPriority(1);
			int priority=thread_1.getPriority();
			System.out.println(priority);
			System.out.println("Thread Running");
			
			}
	}


