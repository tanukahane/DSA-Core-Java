import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reverse =0 ;

        while(num>0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(reverse==original){
            System.out.println(" is palindrome");
        } else{
            System.out.println(" is not a palindeome");
        }

    }
    
}
