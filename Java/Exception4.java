package fifthday.ust;

public class Exception4 {
	public static void main(String args[]) {
		try {
			System.out.println("Rest of code in try block");
		}
		catch(ArithmeticException e){
			
				System.out.println("AritmeticException=>"+ e.getMessage());
			}
		}
	}

