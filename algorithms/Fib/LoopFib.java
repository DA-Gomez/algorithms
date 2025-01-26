package Fib;

import java.util.Scanner;

/**
   This program computes Fibonacci numbers using an iterative method.
*/ 
public class LoopFib {  
   public static void main(String[] args) {  
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = scan.nextInt();

      for (int i = 1; i <= n; i++)
      {
         long f = fib(i);
         System.out.println("fib(" + i + ") = " + f);
      }
   }

   public static long fib(int n)
   {  
      if (n <= 2) { return 1; }
      else {
         long olderValue = 1;
         long oldValue = 1;
         long newValue = 1;
         for (int i = 3; i <= n; i++)
         {  
            newValue = oldValue + olderValue;
            olderValue = oldValue;
            oldValue = newValue;
         }
         return newValue;
      }
   }
}

