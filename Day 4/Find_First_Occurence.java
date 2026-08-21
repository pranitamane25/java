//Find the first position where 10 occurs.(for using break;)


public class Find_First_Occurence {
    public static void main(String[] args){

        int[] arr={10,20,10,40,50};

        int target=10;
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }

        System.out.println("first occurence element:" +index);


    }
    
}
