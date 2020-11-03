package practice4;

import java.util.PriorityQueue;

public class UsingPriorityQ {
public static void main(String args[])
{
	PriorityQueue<String> pq=new PriorityQueue<>();
	pq.add("keshav");
	pq.add("rohit");
	pq.add("Rohan");
	pq.add("Aman");
	pq.add("varun");
	pq.add("Raman");           
	
	System.out.println("First Element: "+pq.element());     // for printing header elements
	System.out.println("Header: "+pq.peek());
	
	pq.poll();                        // for removing elements 
	pq.remove();
	                                             
	System.out.println("AFTER REMOVING TWO ELEMENTS");
	
	//pq.forEach(p-> System.out.println("NAME ARE -> "+pq));
	
	for(String name:pq)
	{
		System.out.println(name);
	}
}
}
