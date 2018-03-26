import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      String simonPattern = "";
      String userPattern = "";
      int userScore = 0;
      int i = 0;

      userScore = 0;
      simonPattern = "RRGBRYYBGY";
      userPattern  = "RRGBBRYBGY";

      char simonLetter = simonPattern.charAt(i);
      char userLetter = userPattern.charAt(i);
      
      while (i < 10) {
         simonLetter = simonPattern.charAt(i);
         userLetter = userPattern.charAt(i);
      
         if (userLetter == simonLetter) {
            ++userScore;
         }
         else {
            break;
         }
         ++i;
      }

      System.out.println("userScore: " + userScore);

      return;
   }
}