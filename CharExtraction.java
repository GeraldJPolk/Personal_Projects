import java.util.*;

/*
 * Author:        Gerald J. Polk   
 * Date:          02/09/2023   
 * Description:   A program that gathers prompted string info to 
 *                produce length between first occurances of two chosen characters.
 * C-Lang:        Java
 * 
 */
public class CharExtraction {

   static Scanner console = new Scanner (System.in);
   public static void main(String args[]) {
   
      // Declare Variables
      String wrd;
      String sub;
      char   bgnChr, endChr;
      int    bgnInt, endInt;
   
      // Prompt & input word(s) w/ no spaces
      System.out.print("Enter a Word(s) (no spaces): ");
         wrd = console.next();
   
      // Prompt & input beginning char
      System.out.print("Enter beginning character: ");
         bgnChr = console.next().charAt(0);
         bgnInt = wrd.indexOf(bgnChr);
   
      // Prompt & input ending char
      System.out.print("Enter ending character: ");
         endChr = console.next().charAt(0);
         endInt = wrd.indexOf(endChr);
   
      // Display word(s), beginning/ending char's & position
      System.out.printf("%nFor the word(s) \"%s\" %n", wrd);
      System.out.printf("\"%c\" is first located at position \"%d\"%n", bgnChr, bgnInt);                
      System.out.printf("while \"%c\" is first located at position \"%d\"%n%n", endChr, endInt);
         sub = wrd.substring(bgnInt, endInt);
                  
      // Display length between beginning and ending char's
      System.out.printf("The substring \"%s%c\" has a length of \"%d\".", sub, endChr, sub.length());
   
   }
}
   
   