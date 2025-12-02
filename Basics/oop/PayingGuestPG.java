package Basics.oop;

public class PayingGuestPG {
    void main(){
        int roomNumber = Integer.parseInt(IO.readln("Enter room number: "));
        int beds = Integer.parseInt(IO.readln("Enter number of beds: "));
        int lockers = Integer.parseInt(IO.readln("How many lockers in the room: "));
        Room room = new Room();

        IO.println("\nRoom Details");
        room.roomNumber(roomNumber);
        room.Bed(beds);
        room.lockers(lockers);
        IO.println("At floor: "+(int)(roomNumber/100));
    }
}
