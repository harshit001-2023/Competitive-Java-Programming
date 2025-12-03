package Basics.oop;

public class Dog {
    static void main() {
        String name = IO.readln("Enter Dog name : ");
        double height = Double.parseDouble(IO.readln("Enter Dog height : "));
        int age = Integer.parseInt(IO.readln("Enter age of the Dog : "));

        Dog dog = new Dog();
        dog.getDogInformation(name,height, age);
        dog.bark();
    }

    public void getDogInformation(String name, double height, int age){
        IO.println("Name of the Dog is "+name);
        IO.println("Dog's height is "+height+" feet");
        IO.println("And age is "+age+" years.");
    }

    public void bark(){
    IO.println("The Dog is Barking.");
    }
}
