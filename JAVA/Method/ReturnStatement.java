import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args){
        Greetings();

        int Firstnum = ReadNumber();
        int Secondnum = ReadNumber();
        int Sum = Firstnum + Secondnum;
        System.out.println("The Sum of two nuumbers are: " + Sum);
    }

    public static void Greetings(){
        System.out.println("WELCOME TO THE CALCULATOR!!!!!!");
    }

    public static int ReadNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();
        
        return number;
    }
}
