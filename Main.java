class Student{
    String studentID;
    String studentName;
    int marks;
    public Student(String studentID,String studentName,int marks){
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }
    public String getStudentID(){
        return studentID;
    }
    public String getSudentName(){
        return studentName;
    }
    public int getMakrs(){
        return marks;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
}
public class Main {
    public static void main(String args[]){
    }
}