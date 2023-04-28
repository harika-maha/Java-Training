public class lcmgcd {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        else
        return gcd(b%a , a);
    }

    static int lcm(int a, int b){
        return((a*b)/gcd(a, b));
    }

    public static void main(String[] args) {
        System.out.println(gcd(2, 3));
        System.out.println(lcm(2, 3));

    }
}
