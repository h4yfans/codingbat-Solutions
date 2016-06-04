/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 * factorial(1) → 1
 * factorial(2) → 2
 * factorial(3) → 6
 */
public class factorial {
    public int factorial(int n) {

        if  (n==1) return 1;

        return n*factorial(n-1);



    }

}
