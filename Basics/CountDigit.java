public class CountDigit {
    public static void main(String[] args) {
        int n = 543678789;
        int count = 0;

        while (n > 0) {
           // int digit = n % 10;
            n = n / 10 ;
            count++;


        }
        System.out.println(count);
    }
    
}
