package Basics.oop;

public class Fan {
    static void main() {
        String name = IO.readln("Enter name : ");
        String coil = IO.readln("Enter coil number : ");
        int wings = Integer.parseInt(IO.readln("Enter wings : "));

        Fan fan = new Fan();
        fan.switchOn(name, coil, wings);
        fan.switchOff();
    }

    public void switchOn(String name, String coil, int wings){
        IO.println("Brand name is "+name);
        IO.println("Coil type : "+coil);
        IO.println("Number of wings : "+wings);
        IO.println("Fan has Started.");
    }
    public void switchOff(){

        IO.println("Fan has switched Off.");
    }
}
