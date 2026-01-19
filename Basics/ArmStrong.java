import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original=n;
        int sum =0;

        while(n > 0){
        int digit = n % 10;
        sum = sum + (digit * digit * digit);
        n = n/10;
        }

    

    if(sum == original){
        System.out.println("ArmStrong number ");
    }else{
        System.out.println("not a ArmStrong number");
    }
}
    
}
