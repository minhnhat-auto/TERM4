package labwk06;

public class Student {

    private int studentID;
    private double gpa;

    public Student(int studentID, double gpa) {
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student; " + studentID + "\t\t GPA: " + gpa;
    }

}
