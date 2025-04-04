import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();

        System.out.print("Enter 3rd number:");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " is the greatest number! ");
        }else if(num2 >= num3){
            System.out.print(num2 + " is the greatest number!");
        }else{
            System.out.print(num3 + " is the greatest number!");
        }
    }
}
