import java.util.Scanner;

public class ProductNumber {
    public static void main(String[] args) {

        System.out.println("enter numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;

        while(num > 0){
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }
        System.out.println("product of number is : " + product);

        
    }
    
}
