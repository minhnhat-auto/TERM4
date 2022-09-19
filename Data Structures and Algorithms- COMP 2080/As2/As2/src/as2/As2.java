package as2;

import java.util.*;

public class As2 {

    public static void main(String[] args) {
        int choice = 0;
        boolean entryMain = true;
        boolean entry = true;
        boolean entry2 = true;
        boolean repeat = true;

        Scanner sc = new Scanner(System.in);

        dictionary dic = new dictionary();

        while (entryMain) {
            System.out.println("\n----- MENU -----");
            System.out.println("1: Add new word");
            System.out.println("2: Delete word");
            System.out.println("3: Get meaning");
            System.out.println("4: Dictionary list");
            System.out.println("5: Spell check a text file");
            System.out.println("6: Exit");
            System.out.print("\nPLEASE CHOOSE ONE: ");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                choice = 0;
                sc.next();
            }
            if (choice == 1) {
                while (entry) {
                    System.out.print("\nEnter a word: ");
                    String enteredWord = sc.next();

                    sc.nextLine();

                    System.out.print("\nEnter meaning of word: ");
                    String enteredMeaning = sc.nextLine();

                    boolean testDup = dic.add(enteredWord, enteredMeaning);
//                    System.out.println("Test " + testDup);
                    if (testDup) {
                        while (repeat) {
                            System.out.print("\nDo you wanna add more? y(YES) - n(NO): ");
                            String confirmRet = sc.next().toLowerCase();
                            if ("n".equals(confirmRet)) {
                                System.out.println("");
                                dic.printDictionary();
                                entry = false;
                                break;
                            } else if ("y".equals(confirmRet)) {
                                entry = true;
                                break;
                            } else if (confirmRet != "y" || confirmRet != "n") {
                                System.out.println("PLease enter correct type!");
                                repeat = true;
                            }
                        }
                    } else if (!testDup) {
                        entry = true;
                    }
                    
                }
                

            } else if (choice == 2) {
                while (entry2) {
                    System.out.print("Enter WORD wanna DELETE: ");
                    String enteredWord = sc.next();

                    boolean test = dic.delete(enteredWord);
                    if (test) {
                        System.out.println("DELETED Successfully(-_-)");
                        while (repeat) {
                            System.out.print("\nDo you wanna DELETE one more WORD? y(YES) - n(NO): ");
                            String confirmRet = sc.next().toLowerCase();
                            if ("n".equals(confirmRet)) {
                                entry2 = false;
                                break;
                            } else if ("y".equals(confirmRet)) {
                                entry2 = true;
                                break;
                            } else if (confirmRet != "y" || confirmRet != "n") {
                                System.out.println("PLease enter CORRECT TYPE!");
                                repeat = true;
                            }
                        }

                    } else if (!test) {
                        System.out.println("There is NOTHING!!");
                    }
                }

            } else if (choice == 3) {
                System.out.println("lalala3");
            } else if (choice == 4) {
                dic.printDictionary();
            } else if (choice == 5) {
                System.out.println("lalala5");
            } else if (choice == 6) {
                System.out.println("(^_^)Thanks for using(^_^)\n");
                entryMain = false;

            } else if (choice != 1 && choice != 2 && choice != 3
                    && choice != 4 && choice != 5 && choice != 5) {
                System.out.println("\n***Please enter option between 1-6 ***");
            }

        }
    }
}




//
//        boolean repeat = true;
//        boolean entry = true;
//        dictionary dic = new dictionary();
//
//        while (entry) {
//            System.out.print("\nEnter a word: ");
//            String enteredWord = sc.next();
//
//            sc.nextLine();
//
//            System.out.print("\nEnter meaning of word: ");
//            String enteredMeaning = sc.nextLine();
//
//            boolean textEx = dic.exists(enteredWord);
//            boolean testDup = dic.add(enteredWord, enteredMeaning);
//            boolean testDele = dic.delete(enteredWord);
//
//            System.out.println("TestEx: " + textEx);
//            System.out.println("TestDup&Add:  " + testDup);
//            System.out.println("TestDe: " + testDele);
//
//            if (testDup) {
//                while (repeat) {
//                    System.out.print("\nDo you wanna add more? y(YES) - n(NO): ");
//                    String confirmRet = sc.next().toLowerCase();
//                    if ("n".equals(confirmRet)) {
//                        System.out.println("");
////                        dic.printDictionary();
//                        entry = false;
//                        break;
//                    } else if ("y".equals(confirmRet)) {
//                        entry = true;
//                        break;
//                    } else if (confirmRet != "y" || confirmRet != "n") {
//                        System.out.println("PLease enter correct type!");
//                        repeat = true;
//                    }
//                }
//            } else if (!testDup) {
//                entry = true;
//            }
//
//        }