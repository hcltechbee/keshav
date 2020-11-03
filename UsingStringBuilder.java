package practice3;

public class UsingStringBuilder {

	public static void main(String args[])
	{
		StringBuilder k= new StringBuilder("Keshav");
		k.append(" Choudhary");            // for adding something in string
		System.out.println(k);
		k.delete(7,16);                   // to delete
		System.out.println(k);
	    k.insert(7," Checking Inserting");            // to insert values in string
	    System.out.println(k);               
	    k.replace(7, 16, "CHECK COMPLETE FOR ");       // to replace something in string
	    System.out.println(k);
	}
}
