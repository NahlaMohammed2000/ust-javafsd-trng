package fifthday.ust;

import java.io.File;

public class Delete_eg {
	public static void main(String args[]) {
		File file=new File("file.txt");
		boolean value=file.delete();
		if(value) {
			System.out.println("File is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}
	}
}
