import java.util.Scanner;

public class PrimeUptoN {
    public static void main(String[] args) {

        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int n=2 ;n<=num ; n++){
            int count =0;

            for(int i=1 ; i<=n;i++){
                if(n % i==0){
                    count++;
                }
            }

            if(count==2){
                System.out.println(n  );
            }
           
        }
        
    }
    
}
