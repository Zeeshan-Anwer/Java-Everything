package com.practice.JodaAPIDates;

import java.time.LocalDate;

public class DateTime {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.of(2000, 4, 3);
		LocalDate d1 = LocalDate.now();
		d1.getDayOfMonth();
		d1.getDayOfWeek();
		d1.getDayOfYear();

	}

}
