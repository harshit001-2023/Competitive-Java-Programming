/*Problem Description
3) Write a Java program that demonstrates method overloading using:

Widening conversion – passing a smaller data type to a method that accepts a larger data type.
(Example: int → double)

Narrowing conversion – converting a larger data type into a smaller data type inside the method.
(Example: double → int)

Examples
Example 1
Input:
10
4.67
Output:
Widening Conversion Method Called
Received double value: 10.0

Narrowing Conversion Method Called
Original double value: 45.67
Narrowed int value: 45*/

void main(){
    // Taking input
    int num = Integer.parseInt(IO.readln());
    double num1 = Double.parseDouble(IO.readln());

    // Method Calling
    wideningConversion(num);
    IO.println();
    narrowingConversion(num1);

}

void wideningConversion(int num){
    // Converting integer to double
    IO.println("Widening Conversion Method Called");
    Double n = (double)num;
    IO.println("Received double value: "+n);
}

void narrowingConversion(double num1){
    // Converting double to int
    IO.println("Narrowing Conversion Method Called");
    IO.println("Original double value: "+num1);
    Integer n = (int)num1;
    IO.println("Narrowed int value: "+n);
}