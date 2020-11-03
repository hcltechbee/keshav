package practice5;

import java.util.Comparator;
import java.util.*;

// players class 
class Players
{
	String name;
	int score;
	
	public Players(String name, int score)
	{
		this.name=name;
		this.score=score;
	}
}

class CompareScore implements Comparator<Players>     // compare class for score
{
     CompareName c=new CompareName();
	@Override
	public int compare(Players o1, Players o2) {
		if(o1.score==o2.score)
		{
			return c.compare(o1, o2);
		}
		else if(o1.score>o2.score)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
}

class CompareName implements Comparator<Players>     // compare class for name
{
	@Override
	public int compare(Players o1, Players o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

public class SortingPlayers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of players");
		int n=sc.nextInt();
		//Players p[]=new Players[n];
		ArrayList<Players> players=new ArrayList<>();
		
		for (int i=0; i<n; i++)
		{
		
			System.out.println("ENTER SCORE");
			int score=sc.nextInt();
			sc.nextLine();
			System.out.println("ENTER NAME");
			
			String name=sc.nextLine();
			
			//p[i]= new Players(name,score);
		                                            // entering players in array list
			players.add(new Players(name,score));
		}
		
		Collections.sort(players,new CompareScore());    // sorting players
		
	//	players.forEach(p -> System.out.println(p.name+"  "+p.score)); 
		
		for(Players p:players)
		{
			System.out.println(p.name+"  "+p.score);   // printing result
		}
	}

}
