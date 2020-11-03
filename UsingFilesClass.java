package practice6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class UsingFilesClass {
	public static void main(String argsp[])
	{
		try {
			Stream<Path> files= Files.list(Paths.get("G:\\COMPUTER"));
			{
				files.forEach(line-> System.out.println(line));
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
