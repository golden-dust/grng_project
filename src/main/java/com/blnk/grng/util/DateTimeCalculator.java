package com.blnk.grng.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCalculator {
	
	int baseYear;
	int baseMonth;
	int baseDay;
	int baseHour;
	int baseMinute;
	int baseSecond;
	LocalDate baseDate;
	LocalDate today;
	LocalTime baseTime;
	LocalTime now;

	public DateTimeCalculator(String baseStringDateTime) {
		String baseStringDate = baseStringDateTime.split(" ")[0];
		String[] baseList = baseStringDate.split("-");
		this.baseYear = Integer.parseInt(baseList[0]);
		this.baseMonth = Integer.parseInt(baseList[1]);
		this.baseDay = Integer.parseInt(baseList[2]);
		this.baseDate = LocalDate.of(baseYear, baseMonth, baseDay);
		
		if (baseStringDate.split(" ").length > 1) {
			String baseStringTime = baseStringDateTime.split(" ")[1];
			String[] baseTimeList = baseStringTime.split(":");
			this.baseHour = Integer.parseInt(baseTimeList[0]);
			this.baseMinute = Integer.parseInt(baseTimeList[1]);
			this.baseSecond = Integer.parseInt(baseTimeList[2]);
		}

	}
	
	public Period getPeriod() {
		today = LocalDate.now();
		return Period.between(baseDate, today);
	}
	
	public int getPeriodInYears() {
		Period p = getPeriod();
		return p.getYears();
	}
	
	public int getPeriodInMonths() {
		Period p = getPeriod();
		return p.getMonths();
	}
	
	public int getPeriodInDays() {
		Period p = getPeriod();
		return p.getDays();
	}
	
	public int getPeriodByMonths() {
		Period p = getPeriod();
		return (int) p.toTotalMonths();
	}
	
	public long getPeriodByDays() {
		long days = ChronoUnit.DAYS.between(baseDate, now);
		return days;
	}
	
	public String getTimeDifference() {
		now = LocalTime.now();
		baseTime = LocalTime.of(baseHour, baseMinute, baseSecond);
		
		long hoursBetween = ChronoUnit.HOURS.between(baseTime, now);
		
		if (hoursBetween >= 24) {
			if (getPeriodInYears() < 1) {
				if (getPeriodInMonths() < 1)  {
					return getPeriodInDays() + "일 전";
				}
				return getPeriodInMonths() + "달 전";
			}
			return getPeriodInYears() + "년 전";
		} else {
			long minutesBetween = ChronoUnit.MINUTES.between(baseTime, now);
			if (minutesBetween < 60) {
				long secondsBetween = ChronoUnit.SECONDS.between(baseTime, now);	
				if (secondsBetween < 60) {
					return secondsBetween + "초 전";
				}
				return minutesBetween + "분 전";
			}
			return hoursBetween + "시간 전";
		}
		
	}
}
