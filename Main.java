import java.util.Scanner;
class Student{
    int studentID;
    String studentName;
    int marks;
    public Student(int studentID,String studentName,int marks){
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }
    public int getStudentID(){
        return studentID;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getMarks(){
        return marks;
    }
    public void setStudentID(int studentID){
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries to be added");
		int size = sc.nextInt();
		Student[] arr = new Student[size];
		for(int i=0; i < size; i++){
			System.out.println("Enter the Student ID: ");
			int ID = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Student Name: ");
			String name = sc.nextLine();
			System.out.println("Enter the Student's Marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			arr[i] = new Student(ID,name,marks);
		}
		
		sc.close();
    }
}