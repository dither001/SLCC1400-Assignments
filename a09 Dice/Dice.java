import java.util.Random;

public class Dice {
   //fields
   private static int[] deeFrequency = new int[13];
   private static final Random rand = new Random();
   
   //methods
   public static void main(String[] args) {
      populateArray();
      printTable();
   }
   
   public static void populateArray() {
      for (int i = 1; i < 36000; ++i) {
         ++deeFrequency[deeRoll(2,6)];
      }
   }
   
   public static void printTable() {
      int x;
      double y;
      System.out.printf("Sum Frequency Percentage");
      for (int i = 2; i <= 12; ++i) {
         x = deeFrequency[i];
         y = deeFrequency[i] / 360.0;
         System.out.printf("%n%3d %9d %9.1f%%", i, x, y); 
      }   
   }
   
   // rolls N1 DICE with N2 SIDES
   public static int deeRoll(int num, int sides) {
      int n = 0;
      for (int i = 1; i <= num; ++i) {
         n += deeFace(sides);
      }
      return n;
   }
   
   // rolls one die of N SIDES
   public static int deeFace(int sides) {
      return rand.nextInt(sides) + 1;
   }
}