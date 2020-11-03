package practice8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecuterService2 {

	public static void main(String args[]) throws InterruptedException, ExecutionException
	{
		ExecutorService es= Executors.newSingleThreadExecutor();
		
		List<Callable<String>> msg=new ArrayList<>();
		
		msg.add(new Callable<String>(){
			public String call() throws Exception
			{
				return "HELLO";
			}
			
		});
		
		msg.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "WORKING GOOD";
			}
			
		});
		
		String message=es.invokeAny(msg);
		System.out.println("MESSAGE IS - "+message);	
	}
}
