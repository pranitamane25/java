public class SecondSmallest {
    public static void main(String[] args){

        int[] arr={10,20,30,40,50,60};

        int smallest=arr[0];

        for(int i=1;i<arr.length;i++)
            {
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }

        int SecondSmallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<SecondSmallest && arr[i]!=smallest){
                SecondSmallest=arr[i];
            }
        }

        System.out.println("Smallest element:" + smallest);
        System.out.println("Second smallest element :" + SecondSmallest);
    }
}
