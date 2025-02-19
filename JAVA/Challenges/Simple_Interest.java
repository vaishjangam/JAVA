//WAP to calculate Simple Interest
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle amt: ");
        double P = sc.nextDouble();

        System.out.print("Enter  Rate of Interest: ");
        double R = sc.nextDouble();

        System.out.print("Enter Time period: ");
        double T = sc.nextDouble();

        double SI = (P*R*T)/100;
        System.out.print("The Simple interest is:"+SI);

        

    }
    
}
