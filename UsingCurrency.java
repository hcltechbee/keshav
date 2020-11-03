package practice9;



import java.text.NumberFormat;  
import java.util.*;  
public class UsingCurrency {  
  
	public static void main(String[] args)
		{
			Locale l=new Locale("en","US"); 
			double dbl=100.34;  
			NumberFormat formatter=NumberFormat.getCurrencyInstance(l);  
			String cur=formatter.format(dbl);  
			System.out.println(cur);  
		}		  
}  
