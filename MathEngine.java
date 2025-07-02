
public class MathEngine{

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
    
     public static void main(String[] args) {
             MathEngine values =new MathEngine();
             values.addition();
             values.subtraction();

        System.out.println("transflower");

    }

}