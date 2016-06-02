/**
 * Created by Kaan Karaca on 03/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
 * The original array will contain at least "count" even numbers.
 * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
 * copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
 * copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
 */
public class copyEvens {
    public int[] copyEvens(int[] nums, int count) {

        int[] newArr = new int[count];

        int i = 0;
        int j = 0;

        while (count!=0){
            if (nums[i]%2==0){
                newArr[j]=nums[i];
                count--;
                j++;
            }
            i++;
        }
        return newArr;

    }

}
