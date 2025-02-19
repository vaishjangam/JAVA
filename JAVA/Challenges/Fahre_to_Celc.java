//WAP to convert Fahreheit to Celcius
import java.util.Scanner;
public class Fahre_to_Celc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit value: ");
        double F= sc.nextDouble();

        double Celcius = (F - 32 )*5/9;
        System.out.print("The fahrenheit in degree celcius is:"+ Celcius);


    }
}
