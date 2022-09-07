import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyFilter implements Predicate<String>
{

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.length()>9;
	}
	
}

public class App6 {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("Kenya");
		countries.add("Bangladesh");
		countries.add("China");
		countries.add("Pakistan");
		countries.add("Zimbabve");
		countries.add("Sri lanka");
		countries.add("Japan");
		countries.add("Canada");
		countries.add("Argentina");
		
//		Stream<String> s = countries.stream();
//		s=s.sorted();
//		List<String> result = s.collect(Collectors.toList());
		
		List<String> result = countries.stream()
		.filter((t)->t.length()>8)
//		.filter(new MyFilter())
//		.sorted()
		.map((t)->t.toUpperCase())
		.collect(Collectors.toList());
		
		
		for(String c:result)
			System.out.println(c);
	}
}
