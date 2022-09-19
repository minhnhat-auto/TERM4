package as1;

//Minh Nhat Vo - 101224717

import java.util.*;


public class As1 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
//        int array_50 = 50;
//        int array_1000 = 1000;
//        int array_10000 = 10000;
//        int array_100000 = 100000;
        int array_1000000 = 1000000;
        
//        coreData srt = new coreData(array_1000000);
//        coreData srt1 = new coreData(array_1000000);
//        coreData srt2 = new coreData(array_1000000);
//        coreData srt3 = new coreData(array_1000000);
        coreData str4 = new coreData(array_1000000);
        coreData str5 = new coreData(array_1000000);
        
        
        for(int x=0; x<array_1000000; x++){
            int val = rand.nextInt(2000000 - 1 + 1) + 1;
//            srt.addData(val);
//            srt1.addData(val);
//            srt2.addData(val);
//            srt3.addData(val);
            str4.addInorder(val);
            str5.addInorder(val);
        }
        
//        srt.showData(10);
//        
//        long start = System.nanoTime();
//        srt._Sort_By_Selection();
//        long end = System.nanoTime();
//        long timeTaken = end - start;
//        System.out.println("\nThe SELECTION sort took "+ timeTaken +" nanoseconds.\n");
//        srt.showData(10);
//        
//        System.out.println("-------------------------------------------");
//
//        
//        srt1.showData(10);
//        
//        start = System.nanoTime();
//        srt1._Sort_By_Insertion();
//        end = System.nanoTime();
//        timeTaken = end - start;
//        System.out.println("\nThe INSERTION sort took " + timeTaken + " nanoseconds.\n");
//        srt1.showData(10);
//        
//        System.out.println("-------------------------------------------");
// 
//        srt2.showData(10);
//        
//        start = System.nanoTime();
//        srt2._Sort_By_Insertion();
//        end = System.nanoTime();
//        timeTaken = end - start;
//        System.out.println("\nThe MERGE sort took " + timeTaken + " nanoseconds.\n");
//        srt2.showData(10);
//        
//        System.out.println("-------------------------------------------");
//        
//        srt3.showData(10);
//        
//        start = System.nanoTime();
//        srt3._Sort_By_Insertion();
//        end = System.nanoTime();
//        timeTaken = end - start;
//        System.out.println("\nThe QUICK sort took " + timeTaken + " nanoseconds.\n");
//        srt3.showData(10);


           str4.showData(10);
           System.out.print("Enter a value to search: ");
           Scanner sc = new Scanner(System.in);
           int userChoice = sc.nextInt();
           
           
           long start = System.nanoTime();
           int ind = str4.binarySearch(userChoice);
           long end = System.nanoTime();
           long timeTaken = end - start;
           System.out.println("Binary search: "+ ind + " took " + timeTaken + " nanoseconds.\n");

           System.out.println("-------------------------------------------");
           
           start = System.nanoTime();
           int ind2 = str5.linearSearch(userChoice);
           end = System.nanoTime();
           timeTaken = end - start;
           System.out.println("Linear search: "+ind2 + " took " + timeTaken + " nanoseconds.\n");
    }
    
}
