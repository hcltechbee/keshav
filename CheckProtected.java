package practice2;

import practice.CheckProtectedPac1;

class CheckProtectedPac2 extends CheckProtectedPac1 {          // in package 2 

    public void printsSum()
    {
    	sum=a+b;                                    // accessing private fields in subclass and in another package
    	System.out.println("SUM Is -> "+sum);
    }
    
}


public class CheckProtected
{
	public static void main(String args[])
	{
		CheckProtectedPac2 ch=new CheckProtectedPac2();
		ch.printsSum();                                // printing result
	}
	
}
