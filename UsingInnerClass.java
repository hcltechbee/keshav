package practice2;

class Outerclass
{
	 private int a=5;
	 private int b=10;
	 private InnerClass prod=new InnerClass();   // instantiating inner class
	 public void printSumProduct()
	 {
		 int total=a+b;
		 System.out.println("Sum Of A and B is -> "+ total);
		 prod.printProduct();
	 }
    
	 
	class InnerClass {             // creating inner class
		private void printProduct()
		{
			int total=a*b;
			System.out.println("Product of A and B is -> "+ total);
		}
	}
}

public class UsingInnerclass {
public static void main(String args[])
{
	Outerclass exe=new Outerclass();
	exe.printSumProduct();                  // executing inner class
}
}
