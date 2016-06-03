/**
 * Created by Kaan Karaca on 03/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
 * Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index,
 * however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
 * The start end end index will both be valid indexes into the array with start <= end.
 * sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
 * sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
 * sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
 */
public class sumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {

        int sum = 0;

        for(int i = start; i < end; i++) {
            if(heights[i] < heights[i+1])
                sum = sum + 2 * (heights[i+1] - heights[i]);
            else
                sum = sum + heights[i] - heights[i+1];
        }

        return sum;


    }

}
