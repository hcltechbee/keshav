package practice8;


class ThreadCreater implements Runnable
{
	String name;
	Thread t;
	
	
	public ThreadCreater(String name)
	{
		this.name=name;
		t= new Thread(this,name);
		//t.setPriority(1);
	}

	@Override
	public void run() {
		System.out.println("thread running");
		for(int i=1;i<=5;i++)
		{
			try {
				t.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName());
		}
	}
}

public class UsingThread {

	public static void main(String args[])
	{
		Thread p=Thread.currentThread();
		System.out.println(p);
		
		ThreadCreater t1=new ThreadCreater("keshav1");
		ThreadCreater t2=new ThreadCreater("keshav2");
		ThreadCreater t3=new ThreadCreater("keshav3");
		
		t1.t.setPriority(3);
		System.out.println(t1.t);
		
		t1.t.start();
		System.out.println("Starting thread 1" +t1.t.isAlive());
		
		t2.t.start();
		System.out.println("Starting thread 2" +t2.t.isAlive());
		
		t3.t.start();
		System.out.println("Starting thread 3" +t3.t.isAlive());	
		/*
		try
		{
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}*/
		System.out.println("CHECKING THREAD 1 IS ALIVE OR NOT "+t1.t.isAlive());
		System.out.println("CHECKING THREAD 2 IS ALIVE OR NOT "+t2.t.isAlive());
		System.out.println("CHECKING THREAD 3 IS ALIVE OR NOT "+t3.t.isAlive());

	}
		
	
}
