package labwk5;

import java.util.Random;
import labwk5.recursion_mergeSort_quickSort.UnOrderedArray;

public class LabWk5 {

    public static void main(String[] args) {
        
       Random rand = new Random(); 
       int arraySize =10000; 
       UnOrderedArray ua0 = new UnOrderedArray(arraySize);
       UnOrderedArray ua1 = new UnOrderedArray(arraySize);
       UnOrderedArray ua2 = new UnOrderedArray(arraySize);
       UnOrderedArray ua3 = new UnOrderedArray(arraySize);
       
       for (int x=0;x<arraySize;x++){
           int val =rand.nextInt(300);
           ua0.addLast(val);  // gives a random number between 0 and 299
           ua1.addLast(val);
           ua2.addLast(val);
           ua3.addLast(val);
       }
   
       ua2.listItems(10);      
       long startTime = System.nanoTime();
       ua2.mergeSortAsc();      
       long endTime =System.nanoTime();
       long timeTaken= endTime-startTime;
       System.out.println("The merge sort took "+timeTaken+" nanoseconds.");
       ua2.listItems(10);
       
       System.out.println("--------------------------------------");
     
       
       ua3.listItems(10);      
       startTime = System.nanoTime();
       ua3.quickSortAsc();      
       endTime =System.nanoTime();
       timeTaken= endTime-startTime;
       System.out.println("The quick sort took "+timeTaken+" nanoseconds.");
       ua3.listItems(10);
       
       System.out.println("--------------------------------------");
       
       ua1.listItems(10);      
       startTime = System.nanoTime();
       ua1.insertionSortAsc();      
       endTime =System.nanoTime();
       timeTaken= endTime-startTime;
       System.out.println("The insertion sort took "+timeTaken+" nanoseconds.");
       ua1.listItems(10);
       
       System.out.println("--------------------------------------");
       
       ua0.listItems(10); 
       startTime = System.nanoTime();
       ua0.selectionSort();      
       endTime =System.nanoTime();
       timeTaken= endTime-startTime;
       System.out.println("The selection sort took "+timeTaken+" nanoseconds.");   
       ua0.listItems(10); 
    }
    

    }
    
