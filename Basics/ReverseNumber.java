import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original=n;
        int reverse=0;

        while(n>0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n =n/10;

        }
        if(original==reverse){
            System.out.println("Number is a prime number ");
        }else{
            System.out.println("number is not a prime number");
        }

    }
    
}
