package doc;

public class Multithreading {

	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
		MultithreadThing mything = new MultithreadThing(i);
		Thread mythread = new Thread(mything);
		mythread.start();
		mythread.isAlive();
		
		}
	}

}
