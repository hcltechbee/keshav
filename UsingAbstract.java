package practice2;

abstract class StudentDirectory{
	int admNum;
	String Name;
	abstract void SetDeails();
	public void showDetails()
	
	{
		System.out.println("NAME OF STUDENT ->"+ Name);
		System.out.println("Admission Number of Student -> "+ admNum);
	}
	
}

class DetailingSt1 extends StudentDirectory     // using abstract class 
{

	@Override
	void SetDeails() {
		Name="KESHAV";
		admNum=12398;
	}
	
}
public class UsingAbstract {
public static void main(String args[])
{
	DetailingSt1 k=new DetailingSt1();
	k.SetDeails();
	k.showDetails();
}
}
