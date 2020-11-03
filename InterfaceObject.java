package practice7;

interface Play
{
	public int no=10;
	public void game();
	
}

class calc implements Play
{

	@Override
	public void game() {
		System.out.println("GAME MESSAGE");
	}
}

public class InterfaceObject {
	public static void main(String args[])
	{
		
		Play p=new calc();
		p.game();
	}

}
