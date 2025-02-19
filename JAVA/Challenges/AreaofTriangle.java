//WAP to calculate area of traingle
import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter breadth:");
        double B = sc.nextDouble();

        System.out.print("Enter Height:");
        double H = sc.nextDouble();

        double AoT = 0.5*B*H;

        System.out.println("The area of triangle is:"+ AoT);


    }
}
