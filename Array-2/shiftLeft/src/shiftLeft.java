/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 * You may modify and return the given array, or return a new array.
 * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
 * shiftLeft([1, 2]) → [2, 1]
 * shiftLeft([1]) → [1]
 */
public class shiftLeft {
    public int[] shiftLeft(int[] nums) {

        int[] newArr = new int[nums.length];

        if (nums.length== 0)
            return nums;

        newArr[nums.length-1] = nums[0];

        for(int i = 0; i <  newArr.length-2 ; i++){
            newArr[i] = nums[i+1];
        }
        return newArr;

    }

}
