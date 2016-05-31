/**
 * Created by Kaan Karaca on 31/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */
public class canBalance {
    public boolean canBalance(int[] nums) {


        int len = nums.length - 1;
        int minus = 1;
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = len - minus; j >= 0; j--)
                sumLeft += nums[j];


            for (int k = len; k > len - minus; k--)
                sumRight += nums[k];


            if (sumLeft != sumRight) {
                minus++;
                sumLeft = 0;
                sumRight = 0;
            } else {
                return true;
            }
        }
        return false;


    }


    public boolean canBalanceSecondWay(int[] nums) {
        int first = 0;
        int second = 0;

        for(int i = 0; i < nums.length; i++)
            second += nums[i];

        for(int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if(first == second)
                return true;
        }

        return false;

}
