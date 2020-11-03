package practice2;

public class VarArgs {
    public void product(int... a)
    {
    	int total=1;
    	for(int num:a)
    	{
    		total=(total*num);
    	}
    	System.out.println("PRODUCT IS -> "+ total);
    }
	public static void main(String args[])
	{
		VarArgs pro=new VarArgs();                   // using var args
		pro.product(1,2,3);
		pro.product(1,5,8,2,6,5,6,6,4);
	}
}
