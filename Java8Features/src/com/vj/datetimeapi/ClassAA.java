package com.vj.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class ClassAA {
	
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfYear());
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getHour());
		System.out.println(time.getHour());
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfYear());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		System.out.println(ldt.getHour());
		
		LocalDate dateOfBirth = LocalDate.of(2000,Month.AUGUST, 26);
		
		Period period = Period.between(dateOfBirth, date);
		System.out.println(period.getYears());
		
		
		System.out.println(date.plusYears(12));
		
		System.out.println(date.minusYears(12));
	}	
}
