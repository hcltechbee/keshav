package practice6;

import java.io.*;

public class UsingFileInputStm {
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("C:\\Users\\hppc\\Desktop\\ex.txt");
			int i=0;
			while((i=fin.read()) != -1)
			{
				char c=((char)i);
				System.out.print(c);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			e.getMessage();
		}
	}

}
