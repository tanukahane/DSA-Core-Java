import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a numbers of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0,b=1;

          System.out.println("fibonaaci series : ");
        for(int i=1;i<=n;i++){
            System.out.print(a);
            int c=a+b;
            a=b;
            b=c;

        }

       
      

    }
    
}
