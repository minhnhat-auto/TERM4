package _labtest1;

public class _Student {

    private int iD;
    private String stdName;
    private float stdGPA;

    public _Student(int iD, String stdName, float stdGPA) {
        this.iD = iD;
        this.stdName = stdName;
        this.stdGPA = stdGPA;
    }
    
//    public _Student(int iD) {
//        this.iD = iD;
//        this.stdName = stdName;
//        this.stdGPA = stdGPA;
//    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public float getStdGPA() {
        return stdGPA;
    }

    public void setStdGPA(float stdGPA) {
        this.stdGPA = stdGPA;
    }

    public String toString() {
        return "\nID STUDENT: " + iD + "\n"
//                + "STUDENT NAME: " + stdName + "\n"
//                + "THE AVERAGE MARKS: " + stdGPA + "\n"
                ;
    }
}
