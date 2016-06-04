/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%)
 * by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * count8(8) → 1
 * count8(818) → 2
 * count8(8818) → 4
 */
public class count8 {
    public int count8(int n) {

        if (n == 0) return 0;

        if (n % 10 == 8) {
            if (n / 10 % 10 == 8)
                return 2+count8(n/10);

            return 1+ count8(n/10);

        }

        return count8(n/10);
    }

}
