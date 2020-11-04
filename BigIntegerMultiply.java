package bigInteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class bbig {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger A=new BigInteger(a);
        BigInteger B=new BigInteger(b);
        BigInteger c=A.add(B);
        BigInteger d=A.multiply(B);
        
        System.out.println(c);
        System.out.println(d);
            }
}
