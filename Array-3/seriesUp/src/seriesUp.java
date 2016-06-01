/**
 * Created by Kaan Karaca on 01/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
 * Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
 * seriesUp(3) → [1, 1, 2, 1, 2, 3]
 * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
 * seriesUp(2) → [1, 1, 2]
 */
public class seriesUp {
    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int pos = 0;

        for(int i = 2; i <=n+1  ; i++){
            for (int j = 1; j < i; j++)
                result[pos++] = j;
        }
        return result;
    }



}
