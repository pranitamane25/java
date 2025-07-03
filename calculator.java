import java.util.*;

public class calculator {
    public static void main(String args[]){

        System.out.println("Enter values");
        Scanner Sc=new Scanner(System.in);
         
        System.out.println("Enter first number");
        int a=Sc.nextInt();

        System.out.println("Enter second number");
        int b=Sc.nextInt();

        System.out.println("Addition:"+ (a+b));
        System.out.println("Subtraction:"+ (a-b));
        System.out.println("Multiplication:"+ (a*b));
        System.out.println("Division:"+ (a/b));
        System.out.println("modulus:"+ (a%b));

    }
}
