public class Find_Index {
    public static void main(String[] args){

        int[] arr={10,20,30,40,50};

        int target=30;
        int index=0;

         for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
         }
         System.out.println("target is found at the index : "+ index);
    }
}
