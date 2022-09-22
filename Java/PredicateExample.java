package streams.ust;

import java.util.function.Predicate;

//Predicate<Integer> logic=X->X>10

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(14));
		System.out.println("Number 18 is EVEN:"+checkOddEven.test(18));
		System.out.println("Number 21 is EVEN:"+checkOddEven.test(21));
	}
}
