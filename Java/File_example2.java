package fifthday.ust;

import java.io.File;

public class File_example2 {
	public static void main(String args[]) {
		File file=new File("newFile.txt");
		try {
			boolean value=file.createNewFile();
			if(value) 
				System.out.println("New file created");
			else
				System.out.println("The file already exists");
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
