package Basics.oop;

import java.util.Locale;

public class SmartPhone {
    static void main() {
        String brand = IO.readln("Enter Mobile Brand : ");
        int ram = Integer.parseInt(IO.readln("Enter Ram : "));
        int megaPixel = Integer.parseInt(IO.readln("Enter Main Camera Megapixel : "));

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.mobileInfo( brand, ram, megaPixel);
        smartPhone.cameraQuality(brand);
    }
    public void mobileInfo(String brand, int ram, int mg){
        IO.println("Brand name : "+brand);
        IO.println("Ram "+ram+" GB");
        IO.println("Camera Megapixel "+mg+"mg");
    }
    public void cameraQuality(String brand){
        switch(brand.toUpperCase(Locale.ROOT)){
            case "SAMSUNG", "APPLE", "GOOGLE" ->
                    IO.println(brand.toUpperCase()+" cameras are the best mobile cameras.");
            case "VIVO","ONEPLUS" ->
                IO.println(brand.toUpperCase()+" camera is average cameras");
            default -> IO.println("All are descent cameras.");
        }
    }
}
