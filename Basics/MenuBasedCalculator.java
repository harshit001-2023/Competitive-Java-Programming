/*
Enter first number : 12
Enter second number : 14
Choose operation: ADD / SUB / MUL / DIV
Output:
add
Result: 26
Important Note
Your code must be able to print the sample output from the provided sample input.
However, your solution is also run against multiple hidden test cases.
You must pass these hidden test cases to fully solve the problem.
*/


void main(){
    IO.println("Enter first number: ");
    int x = Integer.parseInt(IO.readln());
    IO.println("Enter second number: ");
    int y = Integer.parseInt(IO.readln());
    IO.println("Enter an Operation [ADD/SUB/MUL/DIV]: ");
    String operation = IO.readln().toUpperCase();

    String result = switch(operation){
        case "ADD" -> "Result: "+(x+y);
        case "SUB" -> "Result: "+(x-y);
        case "MUL" -> "Result: "+(x*y);
        case "DIV" -> {
            if(y==0) yield "Not divided by zero";
            else yield "Result: "+(x/y);
        }
        default -> "Invalid Operation.";
    };

    IO.println(result);

}
