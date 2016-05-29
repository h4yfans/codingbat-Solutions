/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it.
 * Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
 * notAlone([1, 2, 3], 2) → [1, 3, 3]
 * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
 * notAlone([3, 4], 3) → [3, 4]
 */
public class notAlone {
    public int[] notAlone(int[] nums, int val) {

        if (nums.length<3) return nums;

        for(int i = 1; i < nums.length-1; i++){
            if (nums[i-1]!=nums[i+1] && nums[i]!=nums[i-1]){
                int max = Math.max(nums[i-1],nums[i+1]);
                nums[i] = max;
            }

        }

        return nums;
    }

}
