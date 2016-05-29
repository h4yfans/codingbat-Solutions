/**
 * Created by Kaan Karaca on 29/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
 * so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
 * Note that a length-0 array is valid. (See also: FizzBuzz Code)
 * fizzArray3(5, 10) → [5, 6, 7, 8, 9]
 * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
 * fizzArray3(1, 3) → [1, 2]
 */
public class fizzArray3 {

    public int[] fizzArray3(int start, int end) {

        int length = end-start;
        int[] newArr = new int[length];

        for(int i = 0; i < length ; i++){
            newArr[i] = start;
            start++;
        }
        return newArr;
        
    }

}
