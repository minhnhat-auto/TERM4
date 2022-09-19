package labtest2;

import java.util.*;

public class LabTest2 {

    public static void main(String[] args) {
        int term = 2;
        int sz = 14;
        Scanner input = new Scanner(System.in);

        LinearhashTable lt = new LinearhashTable(sz, 20);

        for(int x = 0; x < term; x++){
            System.out.print("Enter Student First Name: ");
            String fname = input.next();
            
            
            System.out.print("Enter Student Last Name: ");
            String lname = input.next();

            System.out.print("Enter Student's ID:  ");
            int id = input.nextInt();

            System.out.print("Enter Student's Age: ");
            int age = input.nextInt();
            
            
            lt.add(fname, lname, id, age);
            System.out.println("");
            
        }
          
          lt.printTable();
//        

        

    }

}
