package practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Players implements Comparable<Players>
{
	int id ;
	String name;
	int performance;
	public Players(int id,String name,int perf)       // creating a players information directory
	{
		this.id=id;
		this.name=name;
		this.performance=perf;
	}
	@Override
	public int compareTo(Players pla) {
		// To sort user defined class objects
		return name.compareTo(pla.name);
	}
	
}

public class UsingArraylist {
public static void main(String args[])
{
	Players p1=new Players(1,"KESHAV",98);
	Players p2=new Players(2,"AMAN",90);
	Players p3=new Players(3,"VARUN",75);
	
	List<Players> play=new ArrayList<>();
	play.add(p1);
	play.add(p2);
	play.add(p3);
	
	System.out.println(play.isEmpty());               // using isEmpty() method 
	Collections.sort(play);    
	System.out.println("PRINTING SORTED ARRAY");
	/*for(Players p:play)
	{
		System.out.println("ID "+p.id+" Name "+p.name+" performace "+p.performance);
	}*/
	
	play.forEach(p -> {                                // using Lambda Expression
	System.out.println(p.id+"  "+p.name+"  "+p.performance);
	});
	}
   
}
