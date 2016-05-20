/**
 * Created by KAAN on 21/05/2016.
 *
 * Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 * frontPiece([1, 2, 3]) → [1, 2]
 * frontPiece([1, 2]) → [1, 2]
 * frontPiece([1]) → [1]
 */
public class frontPiece {
    public int[] frontPiece(int[] nums) {

        int[] newArr = new int[2];

        if (nums.length>2){
            newArr[0] = nums[0];
            newArr[1] = nums[1];
            return newArr;}

        return nums;


    }

}
