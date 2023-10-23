package Tutr;

public class LeafYearProgram {
	
	public class Main {
		  public static void main(String[] args) {
		    int year = 2020;
		    boolean isLeapYear;

		    // divisible by 4
		    isLeapYear = (year % 4 == 0);

		    // divisible by 4, not by 100, or divisible by 400
		    isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);

		    if (isLeapYear) {
		      System.out.println(year + " is a leap year.");
		    } else {
		      System.out.println(year + " is not a leap year.");
		    }
		  }
		}


}
