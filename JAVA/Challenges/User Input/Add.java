import java.util.Scanner;
public class Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter First number:");         
        int num1 = sc.nextInt();

        System.out.print("Enter Second number:");
        int num2 = sc.nextInt();

        System.out.print("The addition of 2 numbers is: "+(num1 + num2));
    }
}
