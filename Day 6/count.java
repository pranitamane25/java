public class count{
    public static void main(String[] args){

        int[] arr = {10, -20, 30, -40, 50, -60};

        int positivecount=0;
        int negativecount=0;
        int positivesum=0;
        int negativesum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positivecount++;

            }
            else{
                negativecount++;
        }
        }

        System.out.println("Positive count" + positivecount);
        System.out.println("Negative count" + negativecount);
    

    for(int i=0;i<arr.length;i++){

        if(arr[i]>0){
            positivesum=positivesum+arr[i];
        }
        else{
            negativesum=negativesum+arr[i];
        }
    }
    System.out.println("positive sum:" +positivesum);
    System.out.println("negative sum"+ negativesum);

    }
}