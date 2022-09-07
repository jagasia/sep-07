
public class MyThread extends Thread{
	Odd odd;
	public MyThread() {}
	
	public MyThread(Odd odd)
	{
		this.odd=odd;
	}
	
	public void run()
	{
		try {
			odd.display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
