/***********************************************************
* Author: Nick Foster
*
* A07 - Program prints a random number of greetings.
***********************************************************/

import java.util.Random;

public class ManyGreetings {
   public static void main(String[] args) {
      Random rand = new Random();
      int n = rand.nextInt(496) + 5;
      
      for (int i = n; i > 0; i--) {
         // don't want to print "0th" even if it's correct
         if (n - i == 0)
            continue;
         // the ordinals 11th, 12th, and 13th are exceptional
         else if ((n - i) == 11 || (n - i) == 12 || (n - i) == 13)
            System.out.printf("%dth greeting%n", n - i);
         else if ((n - i) % 10 == 1)
            System.out.printf("%dst greeting%n", n - i);
         else if ((n - i) % 10 == 2)
            System.out.printf("%dnd greeting%n", n - i);
         else if ((n - i) % 10 == 3)
            System.out.printf("%drd greeting%n", n - i);
         else 
            System.out.printf("%dth greeting%n", n - i);
      }
   }
}