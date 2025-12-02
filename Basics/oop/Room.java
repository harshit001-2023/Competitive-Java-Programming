package Basics.oop;

public class Room {
    public void Bed(int beds){
        if(beds == 1) IO.println(beds+" Bed");
        else IO.println("No. of Beds are "+beds);
    }
    public void lockers(int lockers){
        IO.println("Number of lockers are "+lockers);
    }
    public void roomNumber(int rnumber){
        IO.println("Room number is "+rnumber);
    }
}
