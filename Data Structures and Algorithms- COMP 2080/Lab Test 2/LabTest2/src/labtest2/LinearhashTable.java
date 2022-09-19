package labtest2;

public class LinearhashTable {

    private Student[] tableStdudent;
    private int numEle;
    private int maxEle;
    private double loadF;

    public LinearhashTable(int size, double loadF) {
        tableStdudent = new Student[size];
        maxEle = size;
        numEle = 0;
        this.loadF = loadF;
    }

    public int hashFunction(String element) {
        int total = 0, w = 1;
        for (int indexChar = 0; indexChar < element.length(); indexChar++) {
            total += w * element.charAt(indexChar);
            w++;
        }
        
        return total % maxEle;
    }

    public int add(String fName, String lName, int stdID, int age) {
        int s = 0;
        if (numEle / maxEle < loadF) {
            int loc = hashFunction(fName);
            System.out.println(fName + " hashed to " + loc);
            s = loc;
            while (tableStdudent[loc] != null) {
                loc = (loc + 1) % maxEle;
            }
            Student std = new Student(fName, lName, stdID, age);
            tableStdudent[loc] = std;
            System.out.println(fName + " was added to " + loc);
            numEle++;
            
        }
        return s;
    }

    public void printTable() {
        System.out.println("_________  STUDENT TABLE DATA ________");
        for (int x = 0; x < maxEle; x++) {
            if(tableStdudent[x] != null){
            System.out.println( 
                                " Name: " + tableStdudent[x].getfName() + tableStdudent[x].getlName()
                                + " ; ID: " + tableStdudent[x].getStdID()
                                + " ; Age: " + tableStdudent[x].getAge()
                                + " was added to " + x);
                                
            }
        }
        System.out.println("______________________________________");
    }

}
