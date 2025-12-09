package Basics;

public class HidingInstanceVaiable {
    int number = 100;
    void main() {
        int number = 10;
        IO.println("Local variable: "+number);
        IO.println("Instance Variable: "+this.number);
    }
}