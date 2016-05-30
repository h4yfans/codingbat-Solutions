/**
 * Created by Kaan Karaca on 30/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 * evenOdd([3, 3, 2]) → [2, 3, 3]
 * evenOdd([2, 2, 2]) → [2, 2, 2]
 */
public class evenOdd {
    public int[] evenOdd(int[] nums) {

        int count = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp = nums[count];
                nums[count] = nums[i];
                count++;
                nums[i] = temp;
            }
        }
        return nums;

    }

}
