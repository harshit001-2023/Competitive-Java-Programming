package Basics.blc;

public class Student {
    public static String calculateGrade(double marks){

        if(marks <= 100 && marks >= 90) return "A+";
        if(marks < 90 && marks >= 75) return "A";
        if(marks < 75 && marks >= 60) return "B";
        if(marks < 60 && marks >= 40) return "C";
        else return "Fail";
    }
}

