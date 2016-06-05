/**
 * Created by Kaan Karaca on 05/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10,
 * and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever
 * arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
 splitOdd10([5, 5, 5]) → true
 splitOdd10([5, 5, 6]) → false
 splitOdd10([5, 5, 6, 1]) → truel
 */
public class splitOdd10 {
    public boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    public boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
        if(start >= nums.length)
            return mult % 10 == 0 && odd % 2 == 1;

        if(splitOdd10Helper(start+1, nums, mult + nums[start], odd))
            return true;

        if(splitOdd10Helper(start+1, nums, mult, odd + nums[start]))
            return true;

        return false;
    }

}
