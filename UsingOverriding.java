package practice2;

class Students{
	String name="";
	int rollNum;

	public void setDetails() {
		name="NULL";
		rollNum=0;
		
	}
	public void disDetails(){
		System.out.println(name);
		System.out.println(rollNum);
	}
}

class Student1 extends Students{
	int marksOb;
	@Override                            // overriding funstions
	public void setDetails()
	{
		this.name="keshav";
		this.rollNum=25;
		this.marksOb=75;
	}
	@Override
	public void disDetails()
	{
		super.disDetails();
		System.out.println(marksOb);
	}
	
}
public class UsingOverriding {
	public static void main(String args[])
	{
		Students k=new Student1();                          // printing details
		k.setDetails();
		k.disDetails();
	}
}
