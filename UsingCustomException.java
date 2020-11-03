package practice3;

import java.util.Scanner;
                                                   // creating custom exception
@SuppressWarnings("serial")
class callerExeception extends Exception
{
	callerExeception (String s)
	{
		super(s);
	}
}


public class UsingCustomException {
 @SuppressWarnings("resource")
public static void main(String args[]) throws callerExeception
 {
	 Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 String snum=String.valueOf(num);
	 int length=snum.length();
	 if(length!=10)
	 {
		 throw new callerExeception("INVALID NUMBER : PLEASE ENTER CORRECT ONE");
	 }
	 else
	 {
		 System.out.println("NUMBER REGISTERED");
	 }
	 sc.close();
 }
	
}
