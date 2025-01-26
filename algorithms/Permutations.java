// package Permutations;

import java.util.ArrayList;
import java.util.List;

/**
   This program computes permutations of a string in a recursive manner (Backtracking)
*/
public class Permutations {

      public static void main(String[] args) {
         int[] num = {1, 2, 3};
         System.out.print(permuteIntArray(num));
   }

   public static ArrayList<String> permutations(String word) {
      ArrayList<String> result = new ArrayList<String>();

      // The empty string has a single permutation: itself
      if (word.length() == 0) { 
         result.add(word); 
         return result; 
      }
      else {
         for (int i = 0; i < word.length(); i++) {
            // Form a shorter word by removing the ith character
            String shorter = word.substring(0, i) + word.substring(i + 1);

            // Generate all permutations of the simpler word
            ArrayList<String> shorterPermutations = permutations(shorter);

            // Add the removed character to the front of
            // each permutation of the simpler word, 
            for (String s : shorterPermutations)
            {
               result.add(word.charAt(i) + s);
            }
         }
         // Return all permutations
         return result;
      }
   }
   
    public static List<List<Integer>> permuteIntArray(int[] nums) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      
      if (nums.length == 0) {
          result.add(new ArrayList<Integer>());
          return result;
      }

      for (int i = 0; i < nums.length; i++) {
         int[] shorter = removeElement(nums, i);

         for (List<Integer> subArray : permuteIntArray(shorter)) {

            List<Integer> temp = new ArrayList<Integer>();
            temp.add(nums[i]);
            for (int e : subArray) {
               temp.add(e);
            }
            result.add(temp);
         }
      }

      return result;
    }

    public static int[] removeElement(int[] nums, int index) {
        int[] newNums = new int[nums.length - 1];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i == index) continue;
            newNums[j] = nums[i];
            j++;
        }
        return newNums;
    }
}

