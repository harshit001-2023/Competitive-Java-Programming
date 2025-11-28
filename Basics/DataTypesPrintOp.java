/*2. MO printingoperation (J-25)
Easy
100 points
• 130 min suggested
Problem Description
You are working as a Java developer in a software company. Your team is developing a utility class that needs to display various types of user data (such as age, weight, username, gender, account balance, etc.). To maintain clean code and avoid method name duplication, your team decides to use the concept of Method Overloading.

You are assigned to implement a overloading concept that should handle and print values of different data types like int, float, double, char, boolean, String, long, short, and byte using the same method name printData.

Coding Requirement :
---------------------

Take various methods to print different kind of data using method overloading concept.

Methods :
---------
1) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : byte type

2) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : short type

3) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : int type

4) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : long type

5) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : float type

6) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : double type

7) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : char type

8) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : boolean type

9) Name of the Method : printData()
      Access modifier : public
          Return type : void
	Argument type : String type

Take a main method to call and print all overloaded methods.

Examples
Example 1
Input:
10
200
5000
9876543210
45.6
78.99
A
true
Virat
Output:
byte=10
short=200
int=5000
long=9876543210
float=45.6
double=78.99
char=A
boolean=true
String=Virat*/

void main(){
    byte num1 = Byte.parseByte(IO.readln());
    short num2 = Short.parseShort(IO.readln());
    int num3 = Integer.parseInt(IO.readln());
    long num4 = Long.parseLong(IO.readln());
    float num5 = Float.parseFloat(IO.readln());
    double num6 = Double.parseDouble(IO.readln());
    char num7 = IO.readln().charAt(0);
    boolean num8 = Boolean.parseBoolean(IO.readln());
    String num9 = IO.readln();

    printData(num1);
    printData(num2);
    printData(num3);
    printData(num4);
    printData(num5);
    printData(num6);
    printData(num7);
    printData(num8);
    printData(num9);

}
public void printData(byte num1){
    IO.println("byte="+num1);

}
public void printData(short num2){
    IO.println("short="+num2);

}
public void printData(int num3){
    IO.println("int="+num3);

}
public void printData(long num4){
    IO.println("long="+num4);

}
public void printData(float num5){
    IO.println("float="+num5);

}
public void printData(double num6){
    IO.println("double="+num6);

}
public void printData(char num7){
    IO.println("char="+num7);

}
public void printData(boolean num8){
    IO.println("boolean="+num8);

}
public void printData(String num9){
    IO.println("String="+num9);

}
