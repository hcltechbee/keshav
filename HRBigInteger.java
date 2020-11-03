package work;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        	String n = scanner.nextLine();
        	
        	
        	
        	BigInteger a=new BigInteger(n);
        	Boolean result;
        	
        	result= a.isProbablePrime(-1);
        	
        	if (result==true)
        	{
        		System.out.println("prime");
        	}
        	else
        	{
        		System.out.println("not prime");
        	}

        scanner.close();
    }
}
