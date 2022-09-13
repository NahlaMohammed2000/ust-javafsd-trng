package fifthday.ust;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Buffered3 {
	public static void main(String args[]) {
		String data="Data inside file";
		try {
			FileOutputStream file=new FileOutputStream("output.txt");
			BufferedOutputStream output =new BufferedOutputStream(file);
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
