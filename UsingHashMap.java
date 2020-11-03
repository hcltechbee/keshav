package practice5;
import java.util.*;
import java.util.Map.Entry;

public class UsingHashMap {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm= new HashMap<>();
		hm.put(1, "KESHAV");
	    hm.put(2, "RAHUL");
		hm.put(3, "Aman");
		hm.put(4, "Varun");
		hm.put(5, "Deepak");
		
		System.out.println("   PRINTING     THE    HASH    MAP    ");
		for(Map.Entry print: hm.entrySet())
		{
			System.out.println("key value is "+print.getKey()+"  VALUE IS :- "+print.getValue());
		}
	
		System.out.println("     "+hm);
		
		// to remove items
		hm.remove(5);
		System.out.println("   AFTER REMOVING DEEPAK  "+hm);
		
		//to use putifAbsent
		hm.putIfAbsent(5, "DEEPAK");
		System.out.println("  AFTER ADDING DEEPAK   "+hm);
		
		// to replace values;
		hm.replace(1, "ALBERT");
		System.out.println("  AFTER REPLACNG 1 element   "+hm);
		
	}

}
