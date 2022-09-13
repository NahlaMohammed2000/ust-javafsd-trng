package fifthday.ust;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_example {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\ustjavafsdb224\\ABC.txt");
		
		try {
			FileOutputStream fs=new FileOutputStream(f);
			byte[] b="I m writing to file" .getBytes();
			if(f.createNewFile())
			{
				System.out.println("file created");
				fs.write(0);
			}
			
			else
			{
				System.out.println("file exist");
			}
		}
			catch(IOException e) {
				e.printStackTrace();
			}
		
	
		}
}
