import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of p:");
        double p=sc.nextDouble();

        System.out.println("enter value of r");
        double r=sc.nextDouble();

        System.out.println("Enter value of t");
        double t=sc.nextDouble();

        double Simple_Interest= p*r*t/100;

        System.out.println(Simple_Interest);
    }
}

