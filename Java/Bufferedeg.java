package fifthday.ust;
import java.io.BufferedReader;
import java.io.FileReader;

public class Bufferedeg {
	public static void main(String args[]) {
		char[] array=new char[100];
		try {
			FileReader file=new FileReader("input.txt");
			BufferedReader input=new BufferedReader(file);
			input.read(array);
			System.out.println("Data in file");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
