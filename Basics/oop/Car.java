package Basics.oop;

public class Car {
    static void main() {
        String name = IO.readln("Enter Brand Name : ");
        int model = Integer.parseInt(IO.readln("Enter model number : "));
        String color = IO.readln("Enter Car Color : ");

        Car car = new Car();
        car.getCarInformation(name, model, color);
        car.drive(name);
    }

    public void getCarInformation(String brand, int model, String color){
        IO.println("Car brand name is "+brand);
        IO.println("Model number is "+model);
        IO.println("Car color is "+color);
    }
    public void drive(String brand){
        IO.println("Your "+brand+" is ready to Drive.");
    }
}
