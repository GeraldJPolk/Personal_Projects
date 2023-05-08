import java.util.*;

/* 
 * Author:        Gerald J Polk 
 * Date:          01/30/2023
 * Description:   A program to calculate the volume in cubic ft & gallons per cubic ft.
 * Lang:          Java
 *
 */
public class VolumeCal {
  
	public static final Scanner console = new Scanner(System.in);
   
	// Initialize constant for gallons per cubic ft
	public static final double GAL_PERcuFT = 7.5;
	public static void main(String[] args) {
   
	// Declare variables
      	int wIN, lIN, dIN;
	double wFT, lFT, dFT, cuFT, gal;
      
	// Prompt for and input Width in inches
	System.out.print("Enter width in inches: ");
		wIN = console.nextInt();
      
	// Prompt for and input the Length in inches
      	System.out.print("Enter length in inches: ");
		lIN = console.nextInt();
      
	// Prompt for and input the Depth in inches
      	System.out.print("Enter depth in inches: ");
		dIN = console.nextInt();
      
	// Convert Length, Width & Depth to ft
	wFT = wIN / 12.0;
	lFT = lIN / 12.0;
	dFT = dIN / 12.0;

	// Calculate # of cuft & gallons per cuft
      	cuFT = wFT * lFT * dFT;
	gal = cuFT * GAL_PERcuFT;
      
	// Display volume in cuft
      	System.out.printf("The objects volume is %.2f cubic feet.%n", cuFT);

	// Display # of gallons
      	System.out.printf("That makes %.0f gallons.", gal);

	}
}
