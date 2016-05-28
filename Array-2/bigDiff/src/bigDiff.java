import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by KAAN on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
 * bigDiff([10, 3, 5, 6]) → 7
 * bigDiff([7, 2, 10, 9]) → 8
 * bigDiff([2, 10, 7, 2]) → 8
 */
public class bigDiff {
    public int bigDiff(int[] nums) {

        Arrays.sort(nums);

        int max = nums[0];
        int min = nums[nums.length-1];

        return max-min;


    }

}
