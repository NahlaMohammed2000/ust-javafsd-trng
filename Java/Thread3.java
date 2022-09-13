package Fifthset2.ust;

public class Thread3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t3=new Thread3();
		try {
			System.out.println("Hai");
		t3.sleep(5000);
		System.out.println("slept");}
		catch(Exception ex){
			ex.printStackTrace();
		}
		

	}

}
