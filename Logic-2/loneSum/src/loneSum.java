/**
 * Created by KAAN on 22/05/2016.
 * Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
 * loneSum(1, 2, 3) → 6
 * loneSum(3, 2, 3) → 2
 * loneSum(3, 3, 3) → 0
 */
public class loneSum {
    public int loneSum(int a, int b, int c) {
        
        if (a==b && b==c)return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;

        return a + b + c;

    }

}
