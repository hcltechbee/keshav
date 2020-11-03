package practice2;

interface Library{             // interface for book details
	
	String Brand="KESHAV BOOK CO.";
	void setBooks();
	void printBooks();
}

class BooksLib implements Library{        // class implementing interface

	int bookNum;
	int Amt;
	@Override                                   // using  methods
	public void setBooks() {
		bookNum=123;
		Amt=100;
	}

	@Override
	public void printBooks() {                                   
		System.out.println("BRAND NAME--> "+Brand);
		System.out.println("BOOK NUMBER--> "+bookNum);
		System.out.println("BOOK AMOUNT--> "+Amt);
		
	}
	
}

public class UsingInterface  {
public static void main(String args[])
		{
			BooksLib b1= new BooksLib();         // processing details
			b1.setBooks();
			b1.printBooks();
		}
}
