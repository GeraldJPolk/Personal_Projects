import java.util.*;
import java.lang.Math;

/* 
 * Author:        Gerald J. Polk 
 * Date:          03/13/2023
 * Description:   A program that outputs the # of grades inputted and sorts
 *								from A's to F's
 *
 */
public class Grades {
  
	public static final Scanner console = new Scanner(System.in);
  	public static void main(String[] args) {
      
      // Declare Variables
      int A = 0; 
      int B = 0; 
      int C = 0; 
      int D = 0; 
      int F = 0; 
      double gad_count;
      int count;
      
      // Prompt & input # of grades
      System.out.print("Enter the number of grades to enter: ");
         count = console.nextInt();
      
      // Loop statement of graded numbers represented from A to F 
      do {
      
         System.out.print("Enter a grade and press enter: ");
            gad_count = console.nextDouble();
               gad_count = Math.round(gad_count);
         
         if (gad_count >= 90) {
            A++;
         } if (gad_count >= 80 && gad_count <= 89) {
            B++;
         } if (gad_count >= 70 && gad_count <= 79) {
            C++;
         } if (gad_count >= 60 && gad_count <= 69) {
            D++;
         } else {
            F++;
         }
      
         count--;
      
      } while (count > 0);
      
      // Display # of grades recevied in alphabetical form
      System.out.printf("%d A's, %d B's, %d C's, %d D's, and %d F's.", A, B, C, D, F);
      
      System.out.println(); 
   }
}
