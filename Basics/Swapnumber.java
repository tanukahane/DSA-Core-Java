import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number : ");
        int a = sc.nextInt();

        System.out.println("enter second number : ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping : ");
        System.out.println("first number  = " + a );
        System.out.println("second number = " + b );
    }
    }
    

