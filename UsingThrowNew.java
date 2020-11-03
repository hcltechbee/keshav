package practice3;

public class UsingThrowNew {
	@SuppressWarnings("unused")
	public static void main(String []args) throws Exception          // using throws and throw new for handling exception
	{
		int arn[]=new int[5];
		int num=1;
		for(int i=0;i<5;i++)
		{
			arn[i]=num++;
		}
		
		
		for(int i=4;i<20;i++) 
		{
			System.out.println(arn[i]);
			throw new Exception("ERROR IN ARRAY");
		}
	}
}
