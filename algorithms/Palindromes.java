// package Palindrome1;

public class Palindromes
{
   public static void main(String[] args)
   {
      String sentence1 = "racecar";      
      System.out.println(sentence1);
      System.out.println(sentence1 + " is palindrome?: " + isPalindrome(sentence1));

      String sentence2 = "racecar";      
      System.out.println(sentence2);
      System.out.println(sentence2 + " is palindrome?: " + alternateIsPalidrome(sentence2));
   }

   /*
      Tests whether a text is a palindrome in a recursive manner
   */
   public static boolean isPalindrome(String text) {
      int length = text.length();

      // Separate case for shortest strings. 
      if (length <= 1) { return true; }
      else {
         // Get first and last characters, converted to lowercase. 
         char first = Character.toLowerCase(text.charAt(0));
         char last = Character.toLowerCase(text.charAt(length - 1));

         if (Character.isLetter(first) && Character.isLetter(last)) {
            // Both are letters. 
            if (first == last) {
               // Remove both first and last character. 
               String shorter = text.substring(1, length - 1);
               return isPalindrome(shorter);
            }
            else {
               return false;
            }
         }
         else if (!Character.isLetter(last)) {
            // Remove last character. 
            String shorter = text.substring(0, length - 1); 
            return isPalindrome(shorter);
         }
         else {
            // Remove first character. 
            String shorter = text.substring(1); 
            return isPalindrome(shorter);
         }
      }
   }   

   public static boolean alternateIsPalidrome(String s) {
      int l = 0;
      int r = s.length() - 1;
      while (l<=r) {
          if (!Character.isLetterOrDigit(s.charAt(l))) { l++; }
          else if (!Character.isLetterOrDigit(s.charAt(r))) { r--; }
          else if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
              return false;
          } else {
              l++;
              r--;
          }
      }
      return true;
   }
}

