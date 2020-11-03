package practice9;

import java.util.Locale;
import java.util.ResourceBundle;

public class UsingResourceBundle {
	public static void main(String args[])
	{
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
		  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
	
	    ResourceBundle bundle2= ResourceBundle.getBundle("keshav",Locale.GERMAN);
	    System.out.println("GREETINGS- "+bundle2.getString("greet"));
	    
	}
	

}
