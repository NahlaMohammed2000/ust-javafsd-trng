package lamda.ust;

public class MethodReference2 {
	public static void ThreadStatus() {
		System.out.println("Thread running");
		
	}
	public static void main(String[] args) {
		Thread t2=new Thread(MethodReference2::ThreadStatus);
		t2.start();
	}
}
