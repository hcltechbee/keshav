package practice7;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class PlayersP
{
	int id;
	String name;
	int perf;
	
	public PlayersP(int id,String name,int perf)
	{
		this.id=id;
		this.name=name;
		this.perf=perf;
	}
}

public class UsingStreamAPI {
	public static void main(String args[])
	{
		List<PlayersP> game=new ArrayList<>();
		game.add(new PlayersP(1,"keshav",10));
		game.add(new PlayersP(2,"rohan",9));
		game.add(new PlayersP(2,"aman",12));
		game.add(new PlayersP(2,"varun",15));
		
		List<PlayersP> Usingstream= game.stream()
				.filter(p->p.perf>10)
				.collect(Collectors.toList());
		
		Usingstream.forEach(p-> System.out.println(p.name));
		
	}

}
