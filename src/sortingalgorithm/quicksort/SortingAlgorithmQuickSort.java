/*
 * This is a simple example of how Quick Sort algorithm works
 */
package sortingalgorithm.quicksort;

/**
 *
 * @author MarcosFerreira || visit my GH: github.com/MarckFerrer
 */
public class SortingAlgorithmQuickSort {
   
   /*
    *  This algorithm uses the 'divide and conquer' strategy, dividing the elements
    *  of the array. It makes  things easier and quicker.
    *
    *  The quick sort will compare two values: the smallest value and 
    */
   
   private static void quickSort(int[] vector, int beginning, int end) {
      
      if (beginning < end) {
         
         int positionMiddle = split(vector, beginning, end);
         
         quickSort(vector, beginning, positionMiddle - 1);
         
         quickSort(vector, positionMiddle + 1, end);
      }
   }

   private static int split(int[] vector, int beginning, int end) {
      int middle = vector[beginning];
      
      int b = beginning + 1, e = end;
      
      while (b <= e) {
         
         if (vector[b] <= middle) {
            
            b++;
            
         }
         else if (middle < vector[e]) {
            
            e--;
            
         }
         else {
            
            int troca = vector[b];
            
            vector[b] = vector[e];
            
            vector[e] = troca;
            
            b++;
            
            e--;
         }
      }
      
      vector[beginning] = vector[e];
      
      vector[e] = middle;
      
      return e;
   }
   
   public static void main(String[] args) {
      // TODO code application logic here
   }   
}