package lamda.ust;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ankit");
		list.add("Mayank");
		list.add("Irfan");
		list.add("Jai");
		
		list.forEach(
				(n)->System.out.println(n));
		
	}
}
