package com.deeksha.map.date_example;

public class MyDateTestRecord {
 public MyDate StartDate;
 public MyDate EndDate;
 public long ExpectedResult;
public MyDateTestRecord(MyDate startDate, MyDate endDate, long expectedResult) {
	
	this.StartDate = startDate;
	this.EndDate = endDate;
	this.ExpectedResult = expectedResult;
}
 


}
