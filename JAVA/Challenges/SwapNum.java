
import java.util.Scanner;
public class SwapNum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a before Swapping:");
        int a = sc.nextInt();

        System.out.println("Enter value of b before the Swapping:");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a after swapping is:" + a);
        System.out.println("The value of b after swapping is:" + b);
        
    }

    //Without user input:
//   // public static void main(String[] args){  
//     int a= 5;
//     int b = 7;
//     int temp;

//     temp = a;
//     a = b;
//     b = temp;

//     System.out.println("The value of a after swapping is:" + a);
//     System.out.println("The value of b after swapping is:" + b);  

//    }


}
