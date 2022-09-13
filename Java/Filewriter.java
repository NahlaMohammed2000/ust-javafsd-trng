package fifthday.ust;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Filewriter {
	public static void main(String args[]) {
		String data="Data in output file";
		try {
			FileWriter file=new FileWriter("output.txt");
			BufferedWriter output=new BufferedWriter(file);
			output.write(data);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
