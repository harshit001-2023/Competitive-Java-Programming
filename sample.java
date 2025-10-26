import java.util.Scanner;

public class sample {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3;
        System.out.println("Enter the side of triangles: ");
        s1= sc.nextInt();
        s2= sc.nextInt();
        s3= sc.nextInt();

        if((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)){
            if((s1 == s2) && (s2 == s3)){
                System.out.println("This is an Isosceles triangle.");
            }else if((s1 != s2) && (s2 != s3) && (s1 != s3)){
                System.out.println("");
            }
        }
    }
}
