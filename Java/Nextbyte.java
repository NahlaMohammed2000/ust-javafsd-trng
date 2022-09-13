package fifthday.ust;

import java.io.FileInputStream;

public class Nextbyte {
	public static void main(String args[]) {
		try {
			FileInputStream input=new FileInputStream("input.txt");
			System.out.println("Data in file");
			int i=input.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
