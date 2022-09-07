import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App4 {

	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee(15, "Raja", "ECE"));
		emps.add(new Employee(200, "Abdul", "BE"));
		emps.add(new Employee(31, "Ravi", "BE"));
		emps.add(new Employee(4, "Gowtham", "Mech"));
		emps.add(new Employee(11, "Vinay", "ECE"));

		Collections.sort(emps);
		for(Employee e:emps)
		{
			System.out.println(e);
		}
	}

}
