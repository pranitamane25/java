public class FindIndexOfArray{
    public static void main(String[] args){

        int[] arr={10,20,30,40,50,60};

        int target=50;
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println("Find index of the element:" +index);
    }
}