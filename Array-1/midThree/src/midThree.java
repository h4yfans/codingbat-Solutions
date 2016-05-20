/**
 * Created by KAAN on 20/05/2016.
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 * midThree([1, 2, 3]) → [1, 2, 3]
 */
public class midThree {
    public int[] midThree(int[] nums) {

        int[] newArr = new int[3];

        newArr[0] = nums[(nums.length + 1) / 2 - 1];
        newArr[1] = nums[(nums.length + 1) / 2];
        newArr[2] = nums[(nums.length + 1) / 2 + 1];

        return newArr;
    }

}
