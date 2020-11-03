package practice9;

import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                for (i=1;i<=15-(s1.length());i++)
                {
                	System.out.print("*");
                }
                if (x<100 && x>9)
                {
                	System.out.print("0"+x);
                }
                else if(x<10)
                {
                	System.out.print("00"+x);
                }
                System.out.println(" ");
            }
            System.out.println("================================");

    }
}
