package labtest2;

public class Student {
    private String fName;
    private String lName;
    private int stdID;
    private int age;
    
    public Student(String fName, String lName, int stdID, int age){
        this.fName = fName;
        this.lName = lName;
        this.stdID = stdID;
        this.age = age;
    }
    
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
