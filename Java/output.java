package fifthday.ust;

import java.io.FileOutputStream;

public class output {
	public static void main(String args[]) {
		String data="inside file";
		try {
			FileOutputStream output=new FileOutputStream("output.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e){
			e.getStackTrace();
			
		}
	}
}
