public class FirstOccurence {
    public static void main(String[] args){

        int[] arr={10,20,30,40,10,20};
        int target=10;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(target);
                break;
            }
        }
    }
}
