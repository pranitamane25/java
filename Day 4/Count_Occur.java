public class Count_Occur{
    public static void main(String[] args){

        int[] arr={10,20,10,40,10,70};

        int count=0;
        int target=10;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;

            }
        }
        System.out.println("count" + count);
    }
}