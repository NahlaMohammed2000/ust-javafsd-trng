package sixth.ust;

import java.time.Period;

public class ParseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age="P17Y9M5D";
		Period p=Period.parse(age);
		System.out.println("The age is:");
		System.out.println(p.getYears()+" Years\n"+p.getMonths()+" Months\n"+p.getDays()+" Days\n");

	}

}
