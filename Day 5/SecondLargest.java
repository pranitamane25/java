//find second largest element

public class SecondLargest {
    public static void main(String[] args) {
        
        int[] arr={10,20,30,40,50};
         int largest= arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>SecondLargest && arr[i]!=largest){
                SecondLargest=arr[i];

            }
        }
        System.out.println("Largest element: " +largest);
        System.out.println("Second largest element:" +SecondLargest);

    }
}
