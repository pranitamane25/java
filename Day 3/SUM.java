public class SUM{
    public static void main(String[] args){

        int[] arr={10,20,30,40,50,100};
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

        System.out.println("sum of the elements:" +sum );

    }
}