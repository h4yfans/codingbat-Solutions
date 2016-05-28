/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 * modThree([2, 1, 3, 5]) → true
 * modThree([2, 1, 2, 5]) → false
 * modThree([2, 4, 2, 5]) → true
 */
public class modThree {
    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) return true;
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) return true;

        }
        return false;


    }

}
