
/**
   Quick sort algorithm. O(nlog(n)) really bad worse case
*/
public class QuickSort {

   public static void main(String[] args) {  
      int[] array = {12, 5, 20, 7, 1, 18, 9, 15, 3, 14, 6, 8};
      sort(array);
      for (int s : array)
         System.out.print(s + ", ");
   }

   public static void sort(int[] a) {  
      sort(a, 0, a.length - 1);
   }

   public static void sort(int[] a, int from, int to) {
      if (from >= to) { return; }
      int p = partition(a, from, to);
      sort(a, from, p);
      sort(a, p + 1, to);
   }

   private static int partition(int[] a, int from, int to) {
      int pivot = a[from];
      int i = from;
      // int i = from - 1;
      // int j = to + 1;
      int j = to;
      while (i < j) {
         // i++; 
         while (a[i] < pivot) { i++; }
         // j--; 
         while (a[j] > pivot) { j--; }
         if (i < j) { 
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
         }
      }
      return j;
   }
}

