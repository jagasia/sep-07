
public class App {

	public static void main(String[] args) {
		String s1=new String("raja");
		String s2=new String("raja");
		
		
//		System.out.println(s1==s2);	//what is the output?
		System.out.println(s1.equals(s2));
		
		int a=20;
		int b=30;
		System.out.println(a==b);	//since a and b are value types, their values are compared
		
	}

}
