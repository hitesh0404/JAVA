package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public DateTime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LocalDate now =LocalDate.now();
	System.out.println(now.plusDays(12));
	System.out.println(now.plusMonths(12));
	LocalDate n =now.of(2024, 12, 12);
	System.out.println(n);
	
	DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String data = pattern.format(now);
	System.out.println(data);
	
	}

}
