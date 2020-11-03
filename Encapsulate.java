package practice;

public class Encapsulate {
	private int graceMarks=10;          // encapsulating calculate method and variables
	private int totalMarks;
	private int marks;
	private String name;
	public void setDetails(String sName,int sMarks)       // to set details
	{
		this.name=sName;
		this.marks=sMarks;
		this.totalMarks=calculateMarks(sMarks);
	}
	private int calculateMarks(int mark)                     // encapsulating calculate method and variables
	{
		int total=mark+graceMarks;
	     return total;
	}
	public void getDetails()         // to get details 
	{
		System.out.println("NAME OF STUDENT => "+name);
		System.out.println("MARKS OBTAINED BY STUDENT => "+marks);
		System.out.println("TOTAL MARKS OF STUDENT AFTER GRACE MARKS => "+totalMarks);
	}

}
