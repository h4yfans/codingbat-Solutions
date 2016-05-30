/**
 * Created by Kaan Karaca on 30/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
 * If there is no odd value to the right of the zero, leave the zero as a zero.
 * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
 * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
 * zeroMax([0, 1, 0]) → [1, 1, 0]
 */
public class zeroMax {
    public int[] zeroMax(int[] nums) {

        int max = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] % 2 != 0)
                max = Math.max(max,nums[i]);
            if (nums[i]==0)
                nums[i] = max;
        }
        return nums;

    }

}
