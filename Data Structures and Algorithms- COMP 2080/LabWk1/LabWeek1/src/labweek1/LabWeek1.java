
package labweek1;
import java.util.*;
/**
 *
 * @author cu_bi
 */
public class LabWeek1 {

    public static void main(String[] args) {
       Random rand = new Random(); 
       int arraySize =1000; 
       
       UnOrderArray ua = new UnOrderArray(arraySize);
       UnOrderArray ua1 = new UnOrderArray(arraySize);
     OrderArray oa = new OrderArray(arraySize);
       
       for (int x=0;x<arraySize;x++){
           int val =rand.nextInt(300);
//           ua.addLast(val);  // gives a random number between 0 and 299
//           ua1.addLast(val);
           oa.addInOrder(val);
       }
      oa.listItem(20);
      System.out.print("Enter a value to search for:");
      Scanner sc = new Scanner(System.in);
      int userChoice = sc.nextInt();
      System.out.println("Item found at location: "+oa.binarySearch(userChoice));
      
//       ua1.listItem(10);
//       
//       long startTime = System.nanoTime();
//       ua1.insertionSort();      
//       long endTime =System.nanoTime();
//       long timeTaken= endTime-startTime;
//       System.out.println("The insertion sort took "+timeTaken+" nanoseconds.");
//       ua1.listItem(10);
//       
//       System.out.println("--------------------------------------");
//       
//       ua.listItem(10); 
//       startTime = System.nanoTime();
//       ua.selectionSort();      
//       endTime =System.nanoTime();
//        timeTaken= endTime-startTime;
//       System.out.println("The selection sort took "+timeTaken+" nanoseconds.");   
//       ua.listItem(10); 
        
    }
    
}
