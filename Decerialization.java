package practice6;

import java.io.*;  
class Deserialization{  
 public static void main(String args[])
 {  
	 try
	 {  
		 FileInputStream fin=new FileInputStream("C:\\Users\\hppc\\Desktop\\ex.txt");
		 ObjectInputStream in=new ObjectInputStream(fin);
	
		   Player s=(Player)in.readObject();
		   Player s2=(Player)in.readObject();
		 		 
		 System.out.println(s.id+" "+s.name);  
		 System.out.println(s2.id+" "+s2.name);
		 
		 in.close();  
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }  
 }  
}  
