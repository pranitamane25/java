import java.util.*;
public class prime {
public static void main(String args[]){
int num,count=0;
System.out.println("Enter any number");
Scanner Sc=new Scanner(System.in);
num=Sc.nextInt();
for(int i=1;i<=num;i++){

    if(num%i==0){
        //if(num==0){
count++;
    }
}
    
if(count==2){
System.out.println("number is prime");
}
else{
        System.out.print("number is not prime");

    }
}
}




