// package sorting;

/**
   Merge sort algorithm.

   Constantly divides the array into two and then it arranges it depending on highest and lowest. Divide and conquer
*/
public class MergeSort {
   
   public static void main(String[] args) {  
      int[] array = {7, 12, 3, 15, 8, 4, 11, 2, 10, 6, 9, 5};
      sort(array);
      for (int s : array)
         System.out.print(s + ", ");
   }

   public static void sort(int[] a) { 

      if (a.length <= 1) { 
         return; 
      }

      int[] first = new int[a.length / 2];
      int[] second = new int[a.length - first.length];
      
      for (int i = 0; i < a.length; i++) {
         if (i < first.length) {
            first[i] = a[i]; 
         } 
         else {
            second[i - first.length] = a[i]; 
         }
      }
      sort(first);
      sort(second);
      merge(first, second, a);
   }

   private static void merge(int[] first, int[] second, int[] a)
   {  
      int iFirst = 0; // Next element to consider in the first array
      int iSecond = 0; // Next element to consider in the second array
      int j = 0; // Next open position in a

      // As long as neither iFirst nor iSecond is past the end, move
      // the smaller element into a
      while (iFirst < first.length && iSecond < second.length) {  
         if (first[iFirst] < second[iSecond]) {  
            a[j] = first[iFirst];
            iFirst++;
         }
         else {  
            a[j] = second[iSecond];
            iSecond++;
         }
         j++;
      }

      // Note that only one of the two loops below copies entries
      // Copy any remaining entries of the first array
      while (iFirst < first.length) { 
         a[j] = first[iFirst]; 
         iFirst++; j++;
      }
      // Copy any remaining entries of the second half
      while (iSecond < second.length) { 
         a[j] = second[iSecond]; 
         iSecond++; j++;
      }
   }
}

