package sixth.ust;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		//2nd way
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		
		//#rd/3rd way
		
		boolean b3=Pattern.matches(".s","as");
		System.out.println(b+" "+b2+" "+b3);

	}

}
