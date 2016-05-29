/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
 * The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
 * post4([2, 4, 1, 2]) → [1, 2]
 * post4([4, 1, 4, 2]) → [2]
 * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
public class post4 {
    public int[] post4(int[] nums) {


        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i]==4){
                int[] newArr ;
                newArr = new int[nums.length-i-1];

                for(int j = 0; j < newArr.length ; i++){
                    newArr[j] = nums[i+j+1];
                }
                return newArr;
            }
        }

        return nums;
    
    }
}
