/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array
 * by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index.
 * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
 * array220([1, 2, 20], 0) → true
 * array220([3, 30], 0) → true
 * array220([3], 0) → false
 */

public class array220 {
    public boolean array220(int[] nums, int index) {


        if (index >= nums.length - 1) return false;

        return  nums[index+1] == 10*nums[index] || array220(nums,index+=1);

    }

}
