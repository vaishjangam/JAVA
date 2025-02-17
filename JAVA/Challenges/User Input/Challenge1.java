//1. Create a program to i/p name of the person and respond with "Welcome NAME to KGCoding"
import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");

        String name = sc.nextLine();
        System.out.print("Welcome " + name + " to KGCoding!!" );
        

    } 
}
