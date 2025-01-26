
/**
   Insertion sort algorithm.
*/
public class InsertionSort
{
   public static void main(String[] args) {  
      int[] array = {7, 12, 3, 15, 8, 4, 11, 2, 10, 6, 9, 5};
      sort(array);
      for (int s : array)
         System.out.print(s + ", ");
   }
   
   public static void sort(int[] a) {
      for (int i = 1; i < a.length; i++) {
         int next = a[i];
         // Move all larger elements up
         int j = i;
         while (j > 0 && a[j - 1] > next) {
            a[j] = a[j - 1];
            j--;
         }
         // Insert the element
         a[j] = next;
      }
   }
}

