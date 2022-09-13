package fifthday.ust;

import java.io.File;

public class File_example3 {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ustjavafsdb224\\List.txt");
		String[] fileList=file.list();
		for(String str: fileList) {
			System.out.println(str);
		}
	}
}
