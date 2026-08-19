public class MinFromArray {
    public static void main(String[] args){

      
        int[] arr={10,20,45,6,79};
          int smallest=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i] < smallest)
            {
                smallest=arr[i];
            }

        }
        System.out.println("Smallest element from array :"+ smallest);
    }
    
}
