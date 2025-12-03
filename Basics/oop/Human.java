package Basics.oop;

public class Human {
    static void main() {
        String gender = IO.readln("Enter Gender : ");
        int age = Integer.parseInt(IO.readln("Enter age : "));
        String name = IO.readln("Enter your name : ");

        Human human = new Human();

        if (gender.toUpperCase().charAt(0) == 'F'){
            human.female(name,age);
        }else if(gender.toUpperCase().charAt(0) == 'M'){
            human.male(name,age);
        }else {
            IO.println("Gender not Found.");
        }

    }
    public void female(String name, int age){
        IO.println("Name "+name+"\nGender Female \nAge : "+age);
    }
    public void male(String name, int age){
        IO.println("Name "+name+"\nGender male \nAge : "+age);
    }
}
