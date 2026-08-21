public class Count_Even{
    public static void main(String[] args){

        int[] arr={10,11,12,13,44,55,45};

       int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Count of even numbers are:" + count);

    }
}