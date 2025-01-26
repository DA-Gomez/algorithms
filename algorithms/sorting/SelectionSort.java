/*
   Selection sort algorithm. O(n^2)

   selects the smallest value in the array and swaps it from the i element
*/
public class SelectionSort {
   public static void main(String[] args) {  
      int[] array = {7, 12, 3, 15, 8, 4, 11, 2, 10, 6, 9, 5};
      sort(array);
      for (int s : array)
         System.out.print(s + ", ");
   }

   public static void sort(int[] a) {  
      for (int i = 0, minPos = i; i < a.length - 1; i++) {  

         for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[minPos]) { minPos = j; }
         }
         
         int temp = a[minPos];
         a[minPos] = a[i];
         a[i] = temp;
         
      }
   }
}

