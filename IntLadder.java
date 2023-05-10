import java.util.*;

/* 
 * Author:        Gerald J Polk 
 * Date:          02/22/2023
 * Description:   A program that outputs three user inputted ints 
 *                then orders them by lowest to greatest.
 *
 */
public class IntLadder {
  
	public static final Scanner console = new Scanner(System.in);
  public static void main(String[] args) {
      
		// Declare Variables
    int num1, num2, num3;
      
    // Prompt & input for ints
    System.out.printf("Enter three integers, pressing enter/space after each.%n");
    	num1 = console.nextInt();
      num2 = console.nextInt();
      num3 = console.nextInt();
         
    // Order ints based on Lowest to Highest
    System.out.printf("%nThe listed integers from lowest to highest are: ");
      
    if (num1 < num2) {
    	if (num1 < num3) {
      	if (num2 < num3) {
        	System.out.printf("%d %d %d", num1, num2, num3);
        } else {
          System.out.printf("%d %d %d", num1, num3, num2);
        }   
      } else {
      	System.out.printf("%d %d %d", num3, num1, num2);
      }
         
    } else if (num2 < num3) {
    	if (num1 < num3) {
      	System.out.printf("%d %d %d", num2, num1, num3);      
      } else {
      	System.out.printf("%d %d %d", num2, num3, num1);
      }         
    } else {
    	System.out.printf("%d %d %d", num3, num2, num1);
    }
      
    System.out.println();
	}
}
