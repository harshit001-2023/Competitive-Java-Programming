/*1. Learning Source Group Analyzer
Easy
100 points
• 120 min suggested
Problem Description
Students learn concepts from multiple sources.
You must take a learning source input and categorize it using a new switch expression with grouped cases.

Categorization Rules:

FACULTY, TEACHER, CLASS
→ "Best understood in Classroom Session"

MENTOR, GUIDE, TRAINER
→ "Best understood during Mentorship"

LAB, PRACTICAL, WORKSHOP
→ "Best understood during Lab Practice"

Any other input
→ "Invalid Source"

Use switch expression returning String, then print the message.

Input Format
---------------
<string>

Output Format
-----------------
Student understood concept: <message>

Examples
Example 1
Input:
faculty
Output:
Student understood concept: Best understood in Classroom Session
Explanation:
NOTE - USE trim() for empty String validation*/

void main(){
    String input = IO.readln().toUpperCase();

    String result = switch(input){
        case "FACULTY","TEACHER","CLASS" -> "Best understood in Classroom Session";
        case "MENTOR","GUIDE","TRAINER" -> "Best understood during Mentorship";
        case "LAB","PRACTICAL","WORKSHOP" -> "Best understood during Lab Practice";
        default -> "Invalid Source";
    };

    IO.println("Student understood concept: "+result);
}