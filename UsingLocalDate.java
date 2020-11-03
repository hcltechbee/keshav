package practice9;

import java.util.*;
import java.text.DateFormat;

public class UsingLocalDate {

	public static void main(String args[])
	{
		Locale l=new Locale("fr","FR");
		
		//DateFormat form=new DateFormat.getDateInstance(DateFormat.DEFAULT,l);
		DateFormat formatter=DateFormat.getDateInstance(DateFormat.DEFAULT,l);  
		DateFormat Formatter=DateFormat.getTimeInstance(DateFormat.DEFAULT,l);
		
		Date today=new Date();
		Date time=new Date();
		
		String pToday=formatter.format(today);
		
		String pTime=Formatter.format(time);
		
		System.out.println("DATE AND TIME IN FRANCE - "+pToday+"  "+pTime);
	
	}
}
