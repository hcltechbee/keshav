package practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeDetect {
	public static void main(String args[])
	{
		LocalDateTime today=LocalDateTime.now();
		System.out.println("TODAY=> "+ today);
		String formattedDate=today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println("USING FORMATED PATERN=> "+formattedDate);
	}

}
