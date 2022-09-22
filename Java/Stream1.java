package streams.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		str.add("Nahla");
		str.add("Rita");
		str.add("Jeeva");
		
		Predicate sp=s->s.equals("Rita");
		Stream sr=str.stream().filter(sp);
		System.out.println(sr.collect(Collectors.toList()));
		
	}
}
