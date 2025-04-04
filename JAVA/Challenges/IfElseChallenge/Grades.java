import java.util.Scanner;
public class Grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks:");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.print("You got A grade");
        }else if(marks < 90 && marks >= 75){
            System.out.print("You got B grade");
        }else if(marks < 75 && marks >=60){
            System.out.print("You got C grade");
        }else if(marks < 60 && marks >= 30){
            System.out.print("You got D grade");
        }else if(marks < 30){
            System.out.print("You got F grade");
        }
    }
}
