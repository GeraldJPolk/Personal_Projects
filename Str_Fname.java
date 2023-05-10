import java.util.Scanner;

/*
 * Author:        Gerald J. Polk   
 * Date:          02/09/2023   
 * Description:   A program to prompt for, input, and output a full name.
 *
 */
public class Str_Fname {

	public static final Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
      
  	// Declare characters to represent user initials
    char Fchar;
    char Mchar;
    char Lchar;
      
		// Prompt and input for First Name, return First Name
    //    W/ fixed grammatical errors (if any)
		System.out.printf("What is your first name? %nFirst: ");
			String Fname = console.nextLine().toUpperCase();
      	Fchar = Fname.charAt(0);
      		Fname = (Fchar + Fname.substring(1).toLowerCase());
      
		// Prompt for and input Middle Name, return inital (Upper Case)
		System.out.printf("What is your middle name? %nMiddle: ");
			String Mname = console.nextLine().toUpperCase();
      	Mchar = Mname.charAt(0);

		// Prompt and input for Last Name, return Last Name
    //    W/ fixed grammatical errors (if any)
		System.out.printf("What is your last name? %nLast: ");
			String Lname = console.nextLine().toUpperCase();
      	Lchar = Lname.charAt(0);
        	Lname = (Lchar + Lname.substring(1).toLowerCase()); 
      
		// Return Full Name & Middle Initial, All Initals UpperCase
		System.out.printf("Hello %s %s. %s ",  Fname, Mchar, Lname);
           
		System.out.println();
	}
}
