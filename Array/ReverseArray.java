public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        System.out.println("original array is :");
        for(int i=0 ; i < arr.length ; i++){
             System.out.print(arr[i]+ " ");

        }
         int left = 0;
        int right = arr.length-1;

        while(left < right){   //greater means index
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println();
        System.out.println("reversed array is :");
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
