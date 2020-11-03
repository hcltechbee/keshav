package practice3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsingRegularExpression {
	public static void main(String args[])         // using regular expression to validate person
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME");
		String name=sc.nextLine();
		name=name.toUpperCase();
		if(Pattern.matches("KESHAV", name)|| (Pattern.matches("ROHIT", name)||(Pattern.matches("ROHAN", name))))
		{
			System.out.println("VALID PERSON");
		}
		else
		{
			System.out.println("INVALID PERSONS");
		}
		sc.close();
	}
	

}
