/**
 * Created by KAAN on 20/05/2016.
 *
 * Given an array of ints length 3, figure out which is larger between the first and last elements in the array, and set all the other elements to be that value. Return the changed array.
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {

        int first = nums[0];
        int end = nums[2];

        if (first>end)
            return nums = new int[]{first, first, first};
        else
            return nums = new int[]{end, end, end};
    }

    public int[] maxEnd3SECONDWAY(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;

        // Solution notes: you could write if-logic to figure out
        // which element is the biggest, but here we use Math.max()
        // to solve that part nicely.
    }
}
