package Fib;

import java.util.Scanner;

/**
   This program computes Fibonacci numbers using a recursive method.
*/ 
public class RecursiveFib {  
   public static void main(String[] args) {  
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = scan.nextInt();

      for (int i = 1; i <= n; i++) {
         long f = fib(i);
         System.out.println("fib(" + i + ") = " + f);
      }
   }

   public static long fib(int n) {  
      if (n <= 2) { 
         return 1; 
      }
      else { 
         return fib(n - 1) + fib(n - 2); 
      }
   }
}

