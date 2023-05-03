package May3;
public class sieve{
    public static void main(String[] args) {
        int a = 10; 
        int b = 30;

        System.out.println("hello!");
        boolean arr[] = new boolean[b];

        arr[0] = false;
        arr[1] = false;

        for(int i=2; i<=Math.sqrt(b); i++){
            if(arr[i]==true){
                for(int j=i*i; j<=b; j = j+i){
                    arr[j] = false;
                    System.out.println(j);
                }
            }
        }

        for(int i=a; i<b; i++){
            if(arr[i]==true){
                System.out.println(i + "is prime");
            }
        }

    }
}