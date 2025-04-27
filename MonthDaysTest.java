//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 3
  //   Version 1.0
import java.util.Scanner;

/**
 * The MonthDaysTest class is used to test the MonthDays class by allowing the user to input
 * a year and a month, and then displaying information about the month and year, including
 * the number of days in the month.
 */
public class MonthDaysTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
            // Input validation loop for month
          
      int month;
      int year;
      while (true)
      {
         while (true) {
            System.out.print("\nEnter a month (1-12): ");
            month = scanner.nextInt();
         
            if (month >= 1 && month <= 12)
            {
               break;
            } 
            else 
            {
               System.out.println("Invalid month!");
            }
         }
          
         while (true) {
            System.out.print("Enter a year: ");
            year = scanner.nextInt();
         
            if (year >= 1582) {
               break;
            } else {
               System.out.println("Invalid year!\n");
            }
         }
      
            // Create a MonthDays object
         MonthDays monthDays = new MonthDays(month, year);
      
            // Display the information
         monthDays.displayMonthInfo();
      
            // Ask the user if they want to try again
         System.out.print("\nDo you want to try continue? Enter y for yes, n for not: ");
         String choice = scanner.next();
      
         if (!choice.equalsIgnoreCase("y")) {
            break;
         }
      }        
   }       
}
