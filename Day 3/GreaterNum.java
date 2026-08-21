public class GreaterNum{
    public static void main(String[] args){

        int[] arr={10,20,30,40,56,9};

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>20){
                count++;
            }
        }

        System.out.println("Count of numbers greater than 20:" + count);
    }
}