

public class Odd
{
//	public void display() throws InterruptedException
//	{
//		String tname=Thread.currentThread().getName();
//		System.out.println("Display method of "+tname+" started");
//		
//		synchronized (this) {
//			for(int i=1;i<20;i+=2)
//			{			
//				System.out.println(Thread.currentThread().getName()+"\t"+i);
//				Thread.sleep(1000);
//			}
//		}
//		System.out.println("Display method of "+tname+" ended");
//	}
	
//	public synchronized void display() throws InterruptedException
//	{
//		String tname = Thread.currentThread().getName();
//		System.out.println("Display method of " + tname + " started");
//
//		for (int i = 1; i < 20; i += 2) {
//			System.out.println(Thread.currentThread().getName() + "\t" + i);
//			Thread.sleep(1000);
//		}
//		System.out.println("Display method of " + tname + " ended");
//	}
	
	public void display() throws InterruptedException
	{
		String tname = Thread.currentThread().getName();
		System.out.println("Display method of " + tname + " started");

		for (int i = 1; i < 20; i += 2) {
			System.out.println(Thread.currentThread().getName() + "\t" + i);
			Thread.sleep(1000);
		}
		System.out.println("Display method of " + tname + " ended");
	}
}
