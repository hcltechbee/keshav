package practice;

public class ImplementingEncapsulation {
	public static void main(String args[])
	{
		Encapsulate student1=new Encapsulate();
		student1.setDetails("KESHAV", 80);               // performing operation for 1st student
		student1.getDetails();
		System.out.println("-----------------------------------------------------");
		Encapsulate student2=new Encapsulate();          // performing operation for 2nt student
		student2.setDetails("ROHIT",70);
		student2.getDetails();
	}

}
