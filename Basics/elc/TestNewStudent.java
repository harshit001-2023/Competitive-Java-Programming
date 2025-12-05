package Basics.elc;

import Basics.blc.NewStudent;

public class TestNewStudent {
    static void main() {
        int studentId = Integer.parseInt(IO.readln("Enter student id: "));
        String studentName = IO.readln("Enter student Name : ");
        int studentMarks = Integer.parseInt(IO.readln("Enter student marks : "));

        NewStudent newStudent = new NewStudent();
        newStudent.setStudentData(studentId, studentName, studentMarks);
        newStudent.calculateGrade();
        newStudent.displayDetails();
    }
}
