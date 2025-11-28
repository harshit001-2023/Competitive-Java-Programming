/*3. Geometric Shapes(J-25)
Easy
100 points
• 130 min suggested
Problem Description
Write a Java program that defines method overloading to calculate the area of geometric shapes.
Implement the following methods:

Coding Requirements :
---------------------
Methods [Access Modifier is public]
-----------------------------------

calculateArea(int side): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (PI * radius * radius).

Take main method to work with above requirement.

Test Cases -1 :
-------------------
Area of the Square :81
Area of the Rectangle :120
Area of the Circle is 32.15:

Examples
Example 1
Input:
Enter side of square: 9
Enter length of rectangle: 12
Enter width of rectangle: 10
Enter radius of circle: 3.2
Output:
Area of the Square : 81
Area of the Rectangle : 120
Area of the Circle : 32.15*/

void main(){
    int side = Integer.parseInt(IO.readln());
    int length = Integer.parseInt(IO.readln());
    int width = Integer.parseInt(IO.readln());
    double radius = Double.parseDouble(IO.readln());
    // final double PI = 3.145;
    if(side >0 && length>0 && width>0 && radius>0){
        claculateArea(side);
        claculateArea(length, width);
        claculateArea(radius);
    } else IO.println("Invalid Input: Values must be greater than zero.");
}
void claculateArea(int side){
    IO.println("Area of the Square : "+(side*side));
}
void claculateArea(int length, int width){
    IO.println("Area of the Rectangle : "+(length*width));
}
void claculateArea(double radius){
    System.out.printf("Area of the Circle : %.2f",(Math.PI*radius*radius));
}