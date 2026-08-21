public class CountOccurences {
    public static void main(String[] args){

        int[] arr={10,20,10,2,10,6,89};
        int target=10;

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Number is occur in times:" +count);
    }
}
