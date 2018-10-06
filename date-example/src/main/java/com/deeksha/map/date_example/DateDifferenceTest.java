package com.deeksha.map.date_example;

import java.util.ArrayList;

public class DateDifferenceTest {
	
	
 public static void main(String[] args) {
	  ArrayList<MyDateTestRecord> testCase= new ArrayList<MyDateTestRecord>();
	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(06,04,2011), 0));//1.Same Date & Month & Year

	  testCase.add(new MyDateTestRecord(new MyDate(6,4,2011), new MyDate(18,4,2011), 12));//2.Different Date but Same Month & Year

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,05,2011), 42));//3.Different Date & Month but Same Year

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,06,2011), 73));//4.Interving Month But Same Year

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2011), 256));//5.More than Six Month Difference But Same Year

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2012), 622));//6.Year Differnce

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2013), 987));//7.Interving Year

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2113), 23511));//8.Interving Century

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2413), 147084));//9.Interving 400 century

	  testCase.add(new MyDateTestRecord(new MyDate(06,04,2011), new MyDate(18,12,2813), 293181));//10.Intervening 800 century
	  
	  testCase.add(new MyDateTestRecord(new MyDate(06,01,2011), new MyDate(06,03,2011), 59));//11.Considering Feb Month but non leap year

	  testCase.add(new MyDateTestRecord(new MyDate(06,01,2012), new MyDate(06,03,2012), 60));//12.Considering Feb Month but Its leap year

	  testCase.add(new MyDateTestRecord(new MyDate(06,02,2012), new MyDate(06,03,2012), 29));//13.Different Date but Same Month & Year,Considering Feb Month but Its leap year

	  testCase.add(new MyDateTestRecord(new MyDate(22,01,2012), new MyDate(15,11,2012), 298));//14.Different Date & Month But same YearYear,Considering Feb Month but Its leap year

	  testCase.add(new MyDateTestRecord(new MyDate(06,02,2012), new MyDate(06,12,2012), 304));//15.Different Date & Month But same YearYear,Considering Feb Month but Its leap year

	  
	  for(MyDateTestRecord testData: testCase ) {
		  MyDate startDate= testData.StartDate;
		  MyDate endDate=testData.EndDate;
		  long expectedResult= testData.ExpectedResult;
		  long ObtainedResult= DateDifferenceProvider.getDateDifference(startDate, endDate);
		  if(expectedResult == ObtainedResult)
			  System.out.println("Test " + (1+ testCase.lastIndexOf(testData))+" , Passed "+ ObtainedResult+ "=obtainedResult "+ expectedResult +"=expectedResult");
		  else
			  System.err.println("Test" + (1+testCase.lastIndexOf(testData))+"Failed"+ ObtainedResult+ "=obtainedResult"+ expectedResult +"=expectedResult");
			  
		  
	  }
 }
}
