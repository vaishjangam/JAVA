//WAP to calculate Perimeter of a rectangle
import java.util.Scanner;
public class Perim_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        int  ABCD = a+b+c+d;

        System.out.println("Perimeter of a Rectangle is: " +ABCD );


    }
}
