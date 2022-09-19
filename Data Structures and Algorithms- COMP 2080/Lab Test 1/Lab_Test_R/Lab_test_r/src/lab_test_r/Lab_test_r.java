package lab_test_r;

import java.util.*;

public class Lab_test_r {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        OrderedObjects or = new OrderedObjects();

        for (int y = 0; y < 1000; y++) {
            System.out.print("Enter flightNum: ");
            int flNum = input.nextInt();
            
            System.out.print("Enter pilotEmployeeNo: ");
            int pilotNum = input.nextInt();
            
            System.out.print("Enter aircraftNum: ");
            String aircNum = input.next();
            
            System.out.print("Enter comChannel:int: ");
            int comCh = input.nextInt();
            
            or.addObject(flNum, pilotNum, aircNum, comCh);
            System.out.println("");
            
        }
        
        or.printElements();
    }

}
