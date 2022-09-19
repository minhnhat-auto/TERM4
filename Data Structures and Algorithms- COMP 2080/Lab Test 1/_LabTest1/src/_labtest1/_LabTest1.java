package _labtest1;

import java.util.*;

public class _LabTest1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many student will you store? ");
        int many = input.nextInt();
        System.out.println("");

        _Controller co = new _Controller(many);

        for (int y = 0; y < many; y++) {
            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            System.out.print("Enter Student Name:  ");
            String name = input.next();

            System.out.print("Enter Student's GPA: ");
            float gpa = input.nextFloat();

            co.addInto_2(id, name, gpa);
//            co.addInto_2(id);
            System.out.println("");

            //co.addInto(id, name, gpa);
        }
//        System.out.print("which's ID Student do yu wanna look for? ");
//        int id_2 = input.nextInt();
//        System.out.println("The Student's ID found at location: " + co.linear(id_2));

        //co.showItem(many);
        //System.out.println("-------------- STUDENT LIST -------------");
        co.selectionSort();
        System.out.println("-------------- SELECTION SORT-------------");
        co.showItem(many);
        co.insertionSort();
        System.out.println("-------------- INSERTION SORT-------------");
        co.showItem(many);

    }

}
