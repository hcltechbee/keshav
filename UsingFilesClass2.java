package practice7;

import java.nio.file.Files;
import java.io.FileOutputStream;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class UsingFileClass {
	public static void main(String args[])
	{
		Path creat=Paths.get("G:\\work\\keshav.txt");
		Path forCpy=Paths.get("G:\\work\\rohit.txt");
		Path empty=Paths.get("G:\\work\\empty.txt");
		try
		{
			Path kesCreate= Files.createFile(creat);
			System.out.println("File Created as keshav.txt");
		
			FileOutputStream write=new FileOutputStream("G:\\work\\keshav.txt");
			String sm="THIS IS THE 1st File";                            
			byte message[]=sm.getBytes();
			write.write(message);   
			System.out.println("message entered in created file");
			
			String sm1="THIS IS 2nd file";
			Files.write(forCpy,sm1.getBytes());
			System.out.println("Message eneterd in target file using Files");
			
			
			Files.copy(creat, forCpy, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("CPY DONE");
			List<String> print= Files.readAllLines(forCpy);
			print.forEach(lin-> System.out.print(lin));
			
			
			
			Files.copy(creat, empty);
			System.out.println(" 2nd CPY DONE");
		    List<String> pr=Files.readAllLines(empty);
			pr.forEach(lin-> System.out.print(lin));
			
			System.out.println("SIZE OF FILE keshav.txt - "+Files.size(creat));
			
			System.out.println("\n"+"CHECKING EXISTANCE OF rohit.txt -> "+Files.exists(forCpy));
			
			Files.delete(forCpy);
			System.out.println("DELETED ROHIT.txt - ");
			
		    
			System.out.println("\n"+"CHECKING EXISTANCE OF rohit.txt -> "+Files.exists(forCpy));
			
			
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
