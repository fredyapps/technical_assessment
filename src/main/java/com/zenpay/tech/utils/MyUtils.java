package com.zenpay.tech.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MyUtils {

	public MyUtils() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static int date_difference(String registered_on) {
		
		
		
        // Define the formatter for the input date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        
        LocalDate date = LocalDate.parse(registered_on, formatter);
		
		// Defining two dates
        LocalDate startDate = LocalDate.of(date.getYear(), date.getMonthValue(),  date.getDayOfMonth());
        
        LocalDate currentdate = LocalDate.now();
        LocalDate endDate = LocalDate.of(currentdate.getYear(), currentdate.getMonthValue(), currentdate.getDayOfMonth());

        // Calculating the period between the two dates
        Period period = Period.between(startDate, endDate);

        // Calculating the total number of months between the two dates
        int monthsBetween = period.getYears() * 12 + period.getMonths();

        System.out.println("printing current date " + currentdate.toString());
        
        return monthsBetween;
	}

}
