import java.util.Scanner;

class Student {
    int studentID;
    String studentName;
    int marks;

    public Student(int studentID, String studentName, int marks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentID() { 
	return studentID; 
	}
    public String getStudentName() { 
	return studentName; 
	}
    public int getMarks() { 
	return marks; 
	}

    public void setStudentID(int studentID) { 
	this.studentID = studentID; 
	}
    public void setStudentName(String studentName) { 
	this.studentName = studentName; 
	}
    public void setMarks(int marks) { 
	this.marks = marks; 
	}

    @Override
    public String toString() {
        return "Student ID: " + getStudentID() + "\nStudent Name: " + getStudentName() + "\nStudent's Marks: " + getMarks() + "\n";
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        Student[] arr = null;
        // Removed global 'total' variable from here to prevent compounding values

        while (run) {    
            System.out.println("===STUDENT GRADE SYSTEM===");
            System.out.println("Option 1: Enter Students");
            System.out.println("Option 2: Display All Students");
            System.out.println("Option 3: Search Students");
            System.out.println("Option 4: Average Calculation");
            System.out.println("Option 5: Exit");
            System.out.print("Enter Option(1,2,3,4,5): ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the number of entries to be added");
                    int size = sc.nextInt();
                    arr = new Student[size];
                    for (int i = 0; i < size; i++) {
                        System.out.println("Enter the Student ID: ");
                        int ID = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Enter the Student Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter the Student's Marks: ");
                        int marks = sc.nextInt();
                        sc.nextLine(); 
                        arr[i] = new Student(ID, name, marks);
                    }
                    break;

                case 2:
                    if (arr == null || arr.length == 0) {
                        System.out.println("No students to be displayed\n");
                        break; 
                    }
                    for (Student s : arr) {
                        if (s != null) {
                            System.out.println(s.toString());
                        }
                    }
                    break;

                case 3:
                    if (arr == null || arr.length == 0) {
                        System.out.println("No student records found. Please add students first.\n");
                        break; 
                    }
                    boolean found = false;
                    System.out.println("Enter the ID of the student: ");
                    int searchID = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println();
                    for (Student s : arr) {
                        if (s != null && searchID == s.getStudentID()) {
                            System.out.println(s.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student ID Not Found\n");
                    }
                    break;

                case 4:
                    if (arr == null || arr.length == 0) {
                        System.out.println("No student records found. Hence no average\n");
                        break; 
                    }
                    
                    // FIX 1: Fresh calculation variable on every selection
                    double currentTotal = 0; 
                    int validCount = 0;
                    
                    for (Student s : arr) {
                        if (s != null) {
                            currentTotal += s.getMarks();
                            validCount++;
                        }
                    }
                    
                    if (validCount > 0) {
                        double average = currentTotal / validCount;
                        System.out.println("The average is: " + average + "\n");
                    } else {
                        System.out.println("No valid student data found.\n");
                    }
                    break;

                case 5:
                    run = false;
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Invalid Option\n");
            }
        }
        sc.close();
    }
}