/**
 * Created by Kaan Karaca on 02/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
 * wordsFront(["a", "b", "c", "d"], 1) → ["a"]
 * wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
 * wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
 */
public class wordsFront {
    public String[] wordsFront(String[] words, int n) {

        String[] newArr = new String[n];

        for (int i = 0; i < newArr.length; i++)
            newArr[i]=words[i];

        
        return newArr;

    }

}
