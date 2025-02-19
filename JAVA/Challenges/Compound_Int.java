//WAP to calculate Compound interest 
import java.util.Scanner;
public class Compound_Int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amt:");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of interest:");
        double R = sc.nextDouble();

        System.out.print("Enter Time period:");
        double T = sc.nextDouble();

        double CI = P*(1 + (R/100))*T;

        System.out.println("The Compound Interest is:"+CI);

    }
    
}
