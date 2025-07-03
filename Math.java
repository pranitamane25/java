

public class Math{

    public void addition()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("addition"+c);
    }
    public void subtraction(){
        int a=30;
        int b=15;
        int c=a-b;
        System.out.println("subtraction"+c);

    }
    public void multiplication(){
    int a=10;
    int b=2;
    int c=a*b;
    System.out.println("multiplication"+c);
}
public void division(){
    int a=40;
    int b=2;
    int c=a/b;
    System.out.println("division"+c);
}
public void mod(){
    int a=100;
    int b=20;
    int c=a % b;
    System.out.println("modulus"+c);
}
    
     public static void main(String[] args) {
             Math values =new Math();
             values.addition();
             values.subtraction();
             values.multiplication();
             values.division();
            values.mod();

        System.out.println("Maths Applications");

    }
}

