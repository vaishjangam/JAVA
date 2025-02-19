// WAP that takes two numbers and show result of all arithmetic operators(=, - , *, /, %)
import java.util.Scanner;
public class Arithemetic_opr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter 1st value: ");
        int a = sc.nextInt();
        
        System.out.println("Enter 2nd value: ");
        int b = sc.nextInt();

        System.out.println("The addition is: " + (a+b));
        System.out.println("The subtraction is: " + (a-b));
        System.out.println("The multiplication is: " + (a*b));
        System.out.println("The division is: " + (a/b));
        System.out.println("The modulus is: " + (a%b));



    }
}
