import java.util.*;
public class factorial{
public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int fact=1;

    for(int i=1;i<=n;i++){
        fact *= i;


    }
    System.out.println("factorial:" + fact);

}
}

