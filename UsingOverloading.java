package practice2;



public class UsingOverloading {
	public int average(int a,int b)        // overloading functions
	{
		int total=(a+b)/2;
		return total;
		
	}
	public int average(int a,int b,int c)
	{
		int total=(a+b+c)/3;
		return total;
	}
	public int average(int a, int b,int c,int d)
	{
		int total=(a+b+c+d)/4;
		return total;
	}
	public static void main(String args[])
	{
		UsingOverloading avg=new UsingOverloading();     // printing results
		System.out.println(avg.average(1,2));
		System.out.println(avg.average(1,2,3));
		System.out.println(avg.average(1, 2, 3, 4));
	}
}
