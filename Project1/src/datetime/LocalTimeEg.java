package datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEg {

	public LocalTimeEg() {
		// TODO Auto-generated constructor stub
	
	}
	
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm");
		String formatedTime = pattern.format(now);
		System.out.println(formatedTime);
		LocalDateTime ofmy = LocalDateTime.of(2024, 12,31,23,59,59);
		System.out.println(ofmy.plusSeconds(1));
	}
}
