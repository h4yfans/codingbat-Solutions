/**
 * Created by KAAN on 20/05/2016.
 *
 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 *
 * sameFirstLast([1, 2, 3]) → false
 * sameFirstLast([1, 2, 3, 1]) → true
 * sameFirstLast([1, 2, 1]) → true
 */
public class sameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if (nums.length>0){
            return nums[0] == nums[nums.length-1];
        }
        return false;
    }

}
