
public class App {

	public static void main(String[] args) throws InterruptedException {
		Odd odd=new Odd();
		Odd o2=new Odd();
		
		MyThread t1=new MyThread(o2);
		MyThread t2=new MyThread(o2);
		MyThread t3=new MyThread(o2);
		t1.setName("First Thread");
		t2.setName("Thread 2");
		t3.setName("T3");
		t1.start();
		t2.start();
		t2.join();
		t3.start();
	}

}
