package recursion;

public class Powxn {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;

        if (n >= 0) return x * myPow(x, n-1);
        else return 1 / myPow(x, -n);
    }
}
