package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Assignment2 {

    public static void main(String[] args) throws FileNotFoundException {
        String choice = null;
        boolean entryMain = true;
        Scanner sc = new Scanner(System.in);

        dictionary dic = new dictionary();

        try {
            File fl = new File("/Users/cu_bi/Desktop/TERM 4/Data Structures and Algorithms- COMP 2080/Assignment2/Assignment2/src/assignment2/wordList.txt");
            Scanner sc1 = new Scanner(fl);
            while (sc1.hasNextLine()) {
                String data = sc1.nextLine();
                dic.add(data, "Undefined word");
            }
            sc1.close();
//            dic.printDictionary();
            System.out.println("There are " + dic.getCount() + " words LOADED in DICTIONARY.\n");
        } catch (FileNotFoundException e) {
            System.out.println("An Error occurred.");
            e.printStackTrace();
        }

        while (entryMain) {
            System.out.println("----- MENU -----");
            System.out.println("1: Add new word");
            System.out.println("2: Delete word");
            System.out.println("3: Get meaning");
            System.out.println("4: Dictionary list");
            System.out.println("5: Spell check a text file");
            System.out.println("6: Exit");
            System.out.print("\nPLEASE CHOOSE ONE: ");

            try {
                choice = sc.nextLine();
            } catch (InputMismatchException e) {
                choice = null;
            }

            if (choice.equals("1")) {
                boolean entry = true;
                boolean repeat = true;

                String enteredWord = null;
                String enteredMeaning = null;

                while (entry) {
                    while (true) {
                        System.out.println("\nEnter a WORD: ");
                        enteredWord = sc.nextLine();

                        if (!isAlpha(enteredWord)) {
                            break;
                        } else if (isAlpha(enteredWord)) {
                            System.out.println("***Please enter CORRECT TYPE***");
                            enteredWord = null;
                            continue;
                        }
                    }
                    while (true) {
                        System.out.println("Enter MEANING of WORD: ");
                        enteredMeaning = sc.nextLine();

                        if (!isAlpha(enteredMeaning)) {
                            break;
                        } else if (isAlpha(enteredMeaning)) {
                            System.out.println("***Please enter CORRECT TYPE***");
                            enteredMeaning = null;
                            continue;
                        }
                    }

                    System.out.println("");
                    boolean testDup = dic.add(enteredWord, enteredMeaning);

                    if (testDup) {
                        System.out.println("Add SUCCESSFULLY!!");
                        while (repeat) {
                            System.out.println("\nDo you wanna add more? y(YES) - n(NO): ");
                            String confirmRet = sc.nextLine().toLowerCase();

                            if ("n".equals(confirmRet)) {
                                System.out.println("");
                                dic.printDictionary();
                                entry = false;
                                break;
                            } else if ("y".equals(confirmRet)) {
                                entry = true;
                                break;
                            } else if (confirmRet != "y" || confirmRet != "n") {
                                System.out.println("***Please enter CORRECT TYPE***");
                                repeat = true;
                            }
                        }
                    } else if (!testDup) {
                        entry = true;
                    }
                }
            } else if (choice.equals("2")) {
                boolean entry = true;
                boolean repeat = true;
                int count = dic.getCount();

                while (entry) {
                    if (count == 0) {
                        System.out.println("\nThese is NOTHING!!!\n");
                        entry = true;
                        break;
                    } else {
                        System.out.println("\nEnter WORD wanna DELETE: ");
                        String enteredWord = sc.nextLine();

                        if (!isAlpha(enteredWord)) {

                            boolean test = dic.delete(enteredWord);

                            if (test) {
                                while (repeat) {
                                    System.out.println("\nDo you wanna DELETE one more WORD? y(YES) - n(NO): ");
                                    String confirmRet = sc.nextLine().toLowerCase();
                                    if ("n".equals(confirmRet)) {
                                        System.out.println("");
                                        entry = false;
                                        break;
                                    } else if ("y".equals(confirmRet)) {
                                        entry = true;
                                        break;
                                    } else if (confirmRet != "y" || confirmRet != "n") {
                                        System.out.println("***Please enter CORRECT TYPE***");
                                        repeat = true;
                                    }
                                }

                            } else if (!test) {
                                entry = true;
                            }
                        } else if (isAlpha(enteredWord)) {
                            System.out.println("***Please enter CORRECT TYPE***");
                            enteredWord = null;
                            entry = true;
                        }

                    }
                }

            } else if (choice.equals("3")) {
                boolean entry = true;
                boolean repeat = true;
                int count = dic.getCount();

                while (entry) {
                    if (count == 0) {
                        System.out.println("\nThese is NOTHING!!!\n");
                        entry = true;
                        break;
                    } else {
                        System.out.println("\nWhich WORD you wanna to TRANSLATE: ");
                        String enteredWord = sc.nextLine();

                        if (!isAlpha(enteredWord)) {

                            String test = dic.getMeaning(enteredWord);

                            if (test != null) {
                                System.out.println(enteredWord + " - " + test);
                                while (repeat) {
                                    System.out.println("\nDo you wanna DELETE one more WORD? y(YES) - n(NO): ");
                                    String confirmRet = sc.nextLine().toLowerCase();
                                    if ("n".equals(confirmRet)) {
                                        System.out.println("");
                                        entry = false;
                                        break;
                                    } else if ("y".equals(confirmRet)) {
                                        entry = true;
                                        break;
                                    } else if (confirmRet != "y" || confirmRet != "n") {
                                        System.out.println("***Please enter CORRECT TYPE***");
                                        repeat = true;
                                    }
                                }
                            } else if (test == null) {
                                System.out.println("\nCANNOT FIND the WORD!!!");
                                entry = true;
                            }
                        } else if (isAlpha(enteredWord)) {
                            System.out.println("***Please enter CORRECT TYPE***");
                            enteredWord = null;
                            entry = true;
                        }
                    }
                }
            } else if (choice.equals("4")) {
                if (dic.getCount() == 0) {
                    System.out.println("\nThese is NOTHING!!!\n");
                } else {
                    System.out.println(dic.printWordList());
                }

            } else if (choice.equals("5")) {
                boolean entry = true;

                while (entry) {

                    System.out.println("Enter TEXT FILE:");
                    String path = sc.nextLine();

                    if (path.isEmpty()) {
                        System.out.println("***Please enter CORRECT TYPE***");
                        path = null;
                        entry = true;
                    }

                    File fl = new File(path);
                    Scanner sc1 = new Scanner(fl);
                    String line = "";
                    String[] line2;

                    while (sc1.hasNextLine()) {
                        line += sc1.nextLine() + " ";
                    }
                    line2 = line.split(" ");
                    for (int x = 0; x < line2.length; x++) {
                        String newItem = line2[x].replace(",", "");
                        newItem = newItem.replace(".", "");
                        if (!dic.search2Test(newItem) && !newItem.equals("")) {
                            System.out.println(newItem);
                        }
                    }
                    break;
                }
            } else if (choice.equals("6")) {
                System.out.println("(^_^)Thanks for using(^_^)\n");
                entryMain = false;

            } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")
                    && !choice.equals("4") && !choice.equals("5") && !choice.equals("6")) {
                System.out.println("\n***Please enter option between 1-6 ***\n");
            }

        }

    }

    public static boolean isAlpha(String str) {

        try {
            if (str.isEmpty()) {
                return true;
            }
            double d = Double.parseDouble(str);

        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
