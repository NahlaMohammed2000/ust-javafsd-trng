package lamda.ust;

public class FunctionInterfaceExample3 {
	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("new thread created");
			}).start();
		}
	}

