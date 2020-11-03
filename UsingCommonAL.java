package practice4;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.List;

public class UsingCommonAL {
	public static void main(String ags[])
	{
		List<String> players=new ArrayList<>();            // using arraylist to edit,iterate and print player names
		players.add("KESHAV");
		players.add("Rahul");
		players.add("Aman");
		players.add("Shubham");
		System.out.println("PLAYERS ARE ->"+players);
		players.remove(3);
		players.add(3,"Zarer");
		System.out.println("PLAYERS ARE ->"+players);
		
		Collections.sort(players);                          // sorting array
		
		System.out.println("AFter SORTING");
		Iterator<String> play=players.iterator();
		while(play.hasNext())
		{
			System.out.println("PLAYER NAME -> "+play.next());
		}
		
	}

}
