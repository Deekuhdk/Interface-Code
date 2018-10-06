package com.deeksha.map.date_example;

public class DateDifferenceProvider {
	
   public static int FEB=2;
   public static int DaysInJan=31;
   public static int DaysInFeb=28;
   public static int DaysInMar=31;
   public static int DaysInApr=30;
   public static int DaysInMay=31;
   public static int DaysInJun=30;
   public static int DaysInJul=31;
   public static int DaysInAug=31;
   public static int DaysInSept=30;
   public static int DaysInOct=31;
   public static int DaysInNov=30;
   public static int DaysInDec=31;
   
   public static int DaysInMonth[]= {DaysInJan,DaysInFeb, DaysInMar,DaysInApr, DaysInMay, DaysInJun, DaysInJul, DaysInAug, DaysInSept, DaysInOct, DaysInNov, DaysInDec};
	//Creates Basic structure of test case(Mandatory)
 public static int getDateDifference(MyDate StartDate, MyDate EndDate) {
	 //case1
	 if(SameDay(StartDate, EndDate) && SameYear(StartDate, EndDate)&& SameMonth(StartDate, EndDate)) {
		return 0;
	 }
	 //case2 and 11
	 else if (SameMonth(StartDate, EndDate) && SameYear(StartDate, EndDate)) {
			return EndDate.getDd() - StartDate.getDd();
		}  
	 //case3 and 4
	 else if(!SameMonth(StartDate, EndDate) && SameYear(StartDate, EndDate))
		{
			return remainingDaysInMonth(StartDate)+daysInInterveningMonth(StartDate, EndDate)+LeadingDaysInMonth(EndDate);
		}
	 //case 5
	 else if(!SameMonth(StartDate, EndDate) && !SameDay(StartDate, EndDate)) {
		 return remainingDaysInMonth(StartDate)+daysInInterveningMonth(StartDate, EndDate)+LeadingDaysInMonth(EndDate);
	 }
	 
	 //case 6
	
	 
	 else {
		 return 0;
	 }
	 
	 
	 
 }
 
 private static int LeadingDaysInMonth(MyDate endDate) {
	// TODO Auto-generated method stub
	return endDate.getDd();
}

private static int daysInInterveningMonth(MyDate startDate, MyDate endDate) {
	
	
		int days=0;
		int monthCount=startDate.getMm();
		while(monthCount < endDate.getMm()-1) {
			days=days+DaysInMonth[monthCount];
			monthCount++;
		}
		return days;
}

private static int remainingDaysInMonth(MyDate startDate) {
		
		return DaysInMonth[startDate.getMm()-1]-startDate.getDd();
	}

//Method for same day
 public static boolean SameDay(MyDate StartDate,MyDate EndDate) {
	 return StartDate.getDd()==EndDate.getDd();
 }
  
 //Method for same month
 public static boolean SameMonth(MyDate StartDate, MyDate EndDate) {
	 return StartDate.getMm()==EndDate.getMm();
 }
 
 //Method for same year
 public static boolean SameYear(MyDate StartDate, MyDate EndDate) {
	 return StartDate.getYyyy()==EndDate.getYyyy();
 }
 
private static int LeadingYear(MyDate endDate) {
	 		int days=LeadingDaysInMonth(endDate);
	 		int monthCount=endDate.getMm()-1;
	 		while(monthCount>0) {
	 			days=days+365;
	 			monthCount--;
	 		}
	 		return days;
	 	}

private static int remainingDaysInYear(MyDate startDate) {
	 		int days=remainingDaysInMonth(startDate);
	 		int monthCount=startDate.getMm();
	 		while(monthCount<=11) {
	 			days=days+DaysInMonth[monthCount];
	 			monthCount++;
	 		}
	 		return days;
	 	} 
	  
	
 
}
