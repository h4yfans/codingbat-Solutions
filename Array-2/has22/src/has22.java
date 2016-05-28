/**
 * Created by Kaan Karaca on 28/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
 * has22([1, 2, 2]) → true
 * has22([1, 2, 1, 2]) → false
 * has22([2, 1, 2]) → false
 */
public class has22 {
    public boolean has22(int[] nums) {

        for(int i = 0; i < nums.length-1 ; i++){
            if (nums[i]==2 && nums[i+1]==2) return true;
        }


        return false;
    }

}
