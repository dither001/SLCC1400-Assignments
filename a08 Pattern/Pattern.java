/******************************************
* Author: Nick Foster
* Last modified: 3/23/2017
*
* A08 Pattern
******************************************/

public class Pattern {
   public static void pattern1(int size) {
      for (int i = 1; i <= size; ++i) {
         System.out.print("o");
         for (int j = 1; j <= size - i; ++j) {
            System.out.print(" ");
         }
         System.out.print("//");
         for (int j = 1; j <= 2 * i - 2; ++j) {
            System.out.print(" ");
         }
         System.out.print("\\\\");
         System.out.print(".");
         System.out.println();
      }
      System.out.println();
   }
   
   public static void pattern2(int size) {
      for (int i = 1; i <= size; ++i) {
         for (int j = 1; j <= size - i; ++j) {
            System.out.print(" ");
         }
         System.out.print(".//");
         for (int j = 1; j <= 2 * i - 2; ++j) {
            System.out.print(" ");
         }
         System.out.print("\\\\");
         for (int j = 1; j <= size - i; ++j) {
            System.out.print(" ");
         }
         System.out.print("o");
         System.out.println();
      }
      System.out.println();
   }
   
   public static void pattern3(int size) {
      for (int i = 1; i <= size; ++i) {
         System.out.print("o");
         for (int j = 1; j <= i - 1; ++j) {
            System.out.print(" ");
         }
         System.out.print("\\\\");
         for (int j = 1; j <= (2 * size) - (2 * i); ++j) {
            System.out.print(" ");
         }
         System.out.print("//.");
         System.out.println();
      }
      System.out.println();
   }
   
   public static void pattern4(int size) {
      for (int i = 1; i <= size; ++i) {
         for (int j = 1; j <= i - 1; ++j) {
            System.out.print(" ");
         }
         System.out.print(".\\\\");
         for (int j = 1; j <= (2 * size) - (2 * i); ++j) {
            System.out.print(" ");
         }
         System.out.print("//");
         for (int j = 1; j <= i - 1; ++j) {
            System.out.print(" ");
         }
         System.out.print("o");
         System.out.println();
      }
      System.out.println();
   }
}