import java.util.Scanner;
public class OddEven {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want:");
        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("Number is even!");
        }else{
            System.out.print("Number is Odd!");
        }

    }
}
