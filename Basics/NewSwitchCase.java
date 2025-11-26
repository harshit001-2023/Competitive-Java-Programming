/*1. grouping and return value
Easy
100 points
• 130 min suggested
Problem Description
Create an Assignment on switch case with "grouping and return value"

Take the input in day in String format using IO class.

Pass this day variable data to switch expression to execute the following cases :
  a) If the given day is MONDAY to FRIDAY , It should return "Weekday" in String format [switch statement must return String type value]

  b) If the given day is SATURDAY to SUNDAY, It should return "Weekend" in String format [switch statement must return String type value]

Write default to print an error message that "Invalid Day"

Print the return String value.

Examples
Example 1
Input:
Enter the day :Monday
Output:
MONDAY is a Weekday
Important Note
Your code must be able to print the sample output from the provided sample input. However, your solution is also run against multiple hidden test cases. You must pass these hidden test cases to fully solve the problem.*/

void main(){
    IO.println("Enter a Day: ");
    String day = IO.readln().toUpperCase();

    String result = switch(day){
        case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> "Weekday";
        case "SAURDAY","SUNDAY"-> "Weekend";
        default -> "not a valid Day";
    };
    IO.println(day+" is a "+result);
}