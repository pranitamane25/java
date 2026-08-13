import java.util.Scanner;

public class Convert_ToFarenhet {
    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of celcius:");
        double c=sc.nextDouble();
        
        double Farnhet=(c*9/5)+32;

        System.out.println(Farnhet);
    }
}
