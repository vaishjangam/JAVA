import java.util.Scanner;
public class PosNegNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Number is positive!");
        }else if(num < 0){
            System.out.print("Number is negative!");
        }else{
            System.out.println("Number is zero!");
        }

    }
}
