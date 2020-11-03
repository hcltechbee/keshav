package practice7;


abstract class players
{
	int id;
	String name;
	public players(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	abstract void displayAll();
}

class game extends players
{

	int score;
	public game(int id, String name,int score) {
		super(id, name);
		this.score=score;
	}
	@Override
	void displayAll() {
		System.out.println("\n"+" ID - "+id+"\n"+" NAME - "+name+"\n"+" SCORE - "+score);
	}	
}


public class AbstractConstructer {
	public static void main(String args[])
	{
		game g1=new game(1,"CSK",256);
		game g2=new game(2,"MI",247);
		
		g1.displayAll();
		g2.displayAll();
	}
}
