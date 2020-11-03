package practice9;

import java.util.Locale;

public class UsingLocale {
	public static void main(String args[])
	{
		Locale l1=Locale.getDefault();
		
		System.out.println(l1.getCountry());
		System.out.println(l1.getLanguage());
		System.out.println(l1.getDisplayCountry());
		System.out.println(l1.getDisplayLanguage());
		System.out.println(l1.getDisplayName());
		
		Locale l2=new Locale("en","US");
		
		System.out.println("\n"+l2.getCountry());
		System.out.println(l2.getLanguage());
		System.out.println(l2.getDisplayCountry());
		System.out.println(l2.getDisplayLanguage());
		System.out.println(l2.getDisplayName());
		
		Locale l3=new Locale("fr","FR");
		
		System.out.println("\n"+l3.getCountry());
		System.out.println(l3.getLanguage());
		System.out.println(l3.getDisplayCountry());
		System.out.println(l3.getDisplayLanguage());
		System.out.println(l3.getDisplayName());
	}

}
