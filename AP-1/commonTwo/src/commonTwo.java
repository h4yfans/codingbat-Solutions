/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates.
 * Return the count of the number of strings which appear in both arrays.
 * The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
 * commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
 * commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
 * commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
 */
public class commonTwo {
    public int commonTwo(String[] a, String[] b) {

        int bIndex = 0;
        int result = 0;

        for (int count = 0; count < a.length; count++) {
            if (count != 0 && a[count - 1].equals(a[count])) continue;
            for (int bCount = bIndex; bCount < b.length; bCount++) {
                if (a[count].compareTo(b[bCount]) <= 0) {
                    bIndex = bCount;
                    break;
                }
            }
            if (a[count].equals(b[bIndex])) {
                result++;
                bIndex++;
            }
        }
        return result;
    }
}
