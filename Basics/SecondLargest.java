public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,45,76,79,89,23,51,48};

        int largest = Integer.MIN_VALUE;
        int secondLargestt = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > largest){
                secondLargestt = largest;   // old largest become second largest
                largest = arr[i];     //new largest
            }
            else if (arr[i] > secondLargestt && arr[i] != largest)  //!=largest it avoid duplicates
           secondLargestt = arr[i];
        }
        System.out.print(secondLargestt);   
    }
}
