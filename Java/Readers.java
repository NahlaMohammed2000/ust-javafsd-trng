package fifthday.ust;

import java.io.FileReader;

public class Readers {
	public static void main(String[] args) {
		char array[]=new char[100];
		try {
			FileReader input=new FileReader("input.txt");
			input.read(array);
			System.out.println("Data  in file");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
