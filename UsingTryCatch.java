package practice3;

public class UsingTryCatch {
public static void main(String args[])
{
	try                         // using try catch block to caught exception
	{
		int a=10;
		int b=0;
		float c=a/b;
		System.out.print(c);
	}
	catch(Exception e)
	{
		System.out.println("EXCEPTION ENCOUNTERED ->"+e);
		System.out.println(e.getStackTrace());
	}
	finally
	{
		System.out.println("Exception handled successfully");
	}
}
}
