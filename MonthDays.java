//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 2
  //   Version 1.0
import java.util.Scanner;
/**
 * The MonthDays class represents a month and year and provides methods to
 * calculate the number of days in the selected month, get the month name, and
 * display information about the month and year.
 */
public class MonthDays 
{
   private int month;
   private int year;

   /**
    * Default constructor that initializes the month to 1 and year to a default
    * value (2023 in this case).
    */
   public MonthDays() 
   {
      month = 1;
      year = 2023; // default year
   }

   /**
    * Constructor with parameters to set the month and year.
    *
    * @param month The month value (1-12).
    * @param year  The year value (>= 1582).
    */
   public MonthDays(int monthValue, int yearValue)
   {
      month = monthValue;
      year = yearValue;
   }

   /**
    * Mutator method to set the month.
    *
    * @param new month The month (1-12).
    */
   public void setMonth(int newMonth)
   {
      month = newMonth;
   }

   /**
    * Mutator method to set the year.
    *
    * @param year The year (>= 1582).
    */
   public void setYears(int newYear) 
   {
      year = newYear;
   }

   /**
    * Accessor method to get the month.
    *
    * @return The month (1-12).
    */
   public int getMonth() {
      return month;
   }

   /**
    * Accessor method to get the year.
    *
    * @return The year (>= 1582).
    */
   public int getYear() {
      return year;
   }

   /**
    * Calculate and return the number of days in the selected month and year,
    * accounting for leap years.
    *
    * @return The number of days in the month.
    */
   public int getNumberOfDays()
   {
      // Calculate the number of days based on the month and the year
      int daysInMonth = 0;
      switch (month)
      {
         case 1: // January
         case 3: // March
         case 5: // May
         case 7: // July
         case 8: // August
         case 10: // October
         case 12: // December
            daysInMonth = 31;
            break;
         case 4: // April
         case 6: // June
         case 9: // September
         case 11: // November
            daysInMonth = 30;
            break;
         case 2: // February
            if (isLeapYear())
            {
               daysInMonth = 29;
            } 
            else 
            {
               daysInMonth = 28;
            }
            break;
      }
      return daysInMonth;
   }

   /**
    * Convert the month number to its name (e.g., 1 -> "January").
    *
    * @return The name of the month.
    */
   public String getMonthName() {
      String[] monthNames = 
         {
         "January", "February", "March", "April", "May", "June",
         "July", "August", "September", "October", "November", "December"
         };
      return monthNames[month - 1];
   }

   /**
    * Display a message about the month and year, including the number of days.
    */
   public void displayMonthInfo() {
      System.out.println(getMonthName() + " in year " + year + " has " + getNumberOfDays() + " days.");
   }

   /**
    * Check if the current year is a leap year.
    *
    * @return True if it's a leap year, false otherwise.
    */
   private boolean isLeapYear() {
      return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }
}


