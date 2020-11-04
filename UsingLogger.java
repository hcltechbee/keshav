package com.client.side;

import java.util.Scanner;
import java.util.logging.Logger;

 @interface UsedLogger
{
	
}

 
 class methodChain{
	 
	 int num;
	 String name;
	 
	 methodChain()
	 {
		 num=0;
		 name="";
	 }
	 
	 public methodChain setName(String name)
	 {
		 this.name=name;
		 return this;
	 }
	 
	 public methodChain setNum(int num)
	 {
		 this.num=num;
		 return this;
	 }
	 
	 void display()
	 {
		 System.out.println("NAME IS -> "+name+"  value -> "+num);
	 }
	 
 }
 
 @UsedLogger               // use of annotations
 public class UsingLogger {

	private static final Logger logg= Logger.getLogger("com.client.side.UsingLogger");
	
	public static void main(String args[])
	{
		
		new methodChain().setName("KESHAV").setNum(15).display();   // for method chaining
		
		logg.info("<<<<_______________________THIS IS MULTIPLICATION APPLICATION____________________>");
		Scanner sc= new Scanner(System.in);
		logg.warning("------------------------ENETR TWO NUMBERS------------------------");
		logg.severe("----------------------TYPE SHOULD BE OF INTEGER---------------------");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=num1*num2;
		logg.info("RESULT GENERATED");
		System.out.println("\n"+"\n"+"RESULT ==> "+result);
		logg.info("---------------------------------------TASK COMPLETED--------------------------");
	}
}
