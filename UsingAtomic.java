package practice8;

import java.util.concurrent.atomic.*;

public class UsingAtomic {
	public static void main(String args[])
	{
		AtomicInteger ai=new AtomicInteger(10);
		
		System.out.println(" incrementing and printing "+ai.incrementAndGet());
		System.out.println(" printing and incrementing "+ai.getAndIncrement());
		
		System.out.println(ai);
	}
	
}
