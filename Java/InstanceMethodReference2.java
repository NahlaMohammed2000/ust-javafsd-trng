package lamda.ust;

public class InstanceMethodReference2 {
 public void printnMsg() {
	 System.out.println("Instance method");
 }
 public static void main(String[] args) {
	Thread t2=new Thread(new InstanceMethodReference2()::printnMsg);
	t2.start();
}
}
