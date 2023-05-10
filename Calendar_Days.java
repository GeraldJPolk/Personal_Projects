import java.util.*;

/* 
 * Author:        Gerald J. Polk 
 * Date:          02/27/2023
 * Description:   A program that outputs days based off
 *                months, years and leap years
 *
 */
public class Calendar_Days {
  
	public static final Scanner console = new Scanner(System.in);
  	public static void main(String[] args) {
      
      // Declare Variables
      int LeapYear, year, month, days;
      
      // Prompt & input for month & year as ints
      System.out.print("Enter a Month: ");
         month = console.nextInt();
         
      System.out.print("Enter a Year: ");
         year = console.nextInt();
         
      // Calculate Leap Year
      LeapYear = year % 4;
      
      // Display month and year w/ leap year accounted for 
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
         days = 31;
         System.out.printf("%d/%d has %d days.", month, year, days);
      } 
      else if (month == 4 || month == 6 || month == 9 || month == 11) {
         days = 30;
         System.out.printf("%d/%d has %d days.", month, year, days);
      }
      else if (month == 2 && LeapYear == 0) {
         days = 29;
         System.out.printf("%d/%d has %d days.", month, year, days);
      }
      else if (month == 2 && LeapYear != 0) {
         days = 28;
         System.out.printf("%d/%d has %d days.", month, year, days);
      }
      else if (month > 12 || month < 1) {
         System.out.print("Invalid Month...");
      }
      
      System.out.println();
   }
}
