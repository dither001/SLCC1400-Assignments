/******************************************
* Author: Nick Foster
* Last modified: 3/23/2017
*
* A08 Pattern App
******************************************/

import java.util.Scanner;

public class PatternApp {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Pattern myPattern = new Pattern();
      
      int patternType = 1;
      int patternSize = 1;
      
      while (patternType != 0) {
         System.out.print("Choose a pattern(1-4) or 0 to quit: ");
         patternType = input.nextInt();
         
         if ((patternType >= 1) && (patternType <= 4)) {
            System.out.print("Size: ");
            patternSize = input.nextInt();
            
            switch (patternType) {
               case 1:
                  myPattern.pattern1(patternSize);
                  break;
               case 2:
                  myPattern.pattern2(patternSize);
                  break;
               case 3:
                  myPattern.pattern3(patternSize);
                  break;
               case 4:
                  myPattern.pattern4(patternSize);
                  break;
            }
         }
      }
      
      if (patternType == 0)
         System.out.print("Good Bye");
   }
}