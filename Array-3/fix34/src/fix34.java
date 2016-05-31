/**
 * Created by Kaan Karaca on 30/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
 * Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
 * every 3 has a number after it that is not a 3 or 4, and a 3 appears in the array before any 4.
 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
 * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 */
public class fix34 {

        if(nums.length < 3) return nums;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 3) {
                for (int j =  1; j < nums.length; j++) {
                    if (nums[j-1] != 3 && nums[j] == 4) {
                        int temp = nums[i + 1];
                        nums[i + 1] = 4;
                        nums[j] = temp;
                    }
                }
            }


        }

        return nums;

    }

}
