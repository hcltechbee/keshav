  package practice4;
import java.util.*;

public class UsingLinkList {
public static void main(String args[])
{
	LinkedList<String> tl=new LinkedList<>();
	tl.add("keshav");
	tl.add("rohit");
	tl.add("rohan");
	tl.add("zarer");
	tl.add("aman");
	tl.add("varun");
	List<String> t2=new LinkedList<>();
    t2.add("RAMAN");
    t2.add("Suresh");
    
    tl.addAll(t2);
    
    tl.forEach(p-> System.out.println("PLAYERS NAME-> "+p));
    
    System.out.println(" ---------------------------------------REMOVING FIST ELEMENT");
    tl.removeFirst();
    tl.forEach(p-> System.out.println("PLAYERS NAME-> "+p));
    tl.add(0,"keshav");
    
    System.out.println("---------------------------------------- REMOVING Last ELEMENT");
    tl.removeLast();
    tl.forEach(p-> System.out.println("PLAYERS NAME-> "+p));
    tl.add(7,"Suresh");
    
    System.out.println("---------------------------------------REMOVING FIRST OCCURANCE OF VARUN");
    tl.removeFirstOccurrence("varun");
    tl.forEach(p-> System.out.println("PLAYERS NAME-> "+p));
    
    tl.removeIf(p-> p.equals("keshav"));
    System.out.println(" ----------------------------------------REMOVING keshav");
    tl.forEach(p-> System.out.println("PLAYERS NAME-> "+p));
}
}
