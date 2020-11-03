package practice6;

import java.io.*;

class Player implements Serializable	
{
	int id;
	String name;
	public Player(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class SerializableOutputStream {
	public static void main(String args[])
	{
		try
		{
			Player s1=new Player(1,"KESHAV");
			Player s2=new Player(2,"AMAN");
			FileOutputStream fo=new FileOutputStream("C:\\Users\\hppc\\Desktop\\ex.txt");
			ObjectOutputStream o=new ObjectOutputStream(fo);
			o.writeObject(s1);
			o.writeObject(s2);
			o.flush();
			o.close();
			System.out.println("TASK COMPLETE");
		}
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			e.getMessage();
		}
	}

}
