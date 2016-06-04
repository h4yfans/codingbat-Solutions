/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * count7(717) → 2
 * count7(7) → 1
 * count7(123) → 0
 */
public class count7 {
    public int count7(int n) {

        if (n==0) return 0;

        if (n % 10 == 7)
            return 1 + count7(n/10);

        return count7(n/10);

    }

}
