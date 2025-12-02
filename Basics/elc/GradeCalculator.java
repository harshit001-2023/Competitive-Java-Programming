package Basics.elc;

import Basics.blc.Calculator;
import Basics.blc.Student;

import java.util.Scanner;

public class GradeCalculator {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter your marks : ");
        double marks = sc.nextDouble();

        // Calling and displaying Grades archived by students according to their marks.
        IO.print("Your grade is : "+ Student.calculateGrade(marks));
    }
}
