import java.util.Scanner;

public class gcdN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n+1];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        int i = 0;
        int gcd = 0;
        while(i<n){
            gcd = gcd(arr[i], arr[i+1]);
            arr[i+1] = gcd;
            i++;
        }

        System.out.println(gcd);

    }
    public static int gcd(int a, int b){
        if(a==0)
            return b;
        else
            return(gcd(b%a, a));
    }
}
