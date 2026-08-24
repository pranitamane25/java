public class Count_Pos_negative{

    public static void main(String[] args) {
        
        int[] arr={19,-1,11,-89,20,-4};

        int positivecount=0;
        int negativecount=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                positivecount++;
               
            }
            else{
                negativecount++;
              
            }
        }
         System.out.println("positive numbers" +positivecount);
        System.out.println("negative numbers" +negativecount);

    }
}