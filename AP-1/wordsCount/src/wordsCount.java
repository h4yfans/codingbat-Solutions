/**
 * Created by Kaan Karaca on 02/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of strings, return the count of the number of strings with the given length.
 * wordsCount(["a", "bb", "b", "ccc"], 1) → 2
 * wordsCount(["a", "bb", "b", "ccc"], 3) → 1
 * wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 */
public class wordsCount {
    public static void main(String[] args){

        String[] arr = {"xx", "yyy", "x", "yy", "z"};

        System.out.println(arr[2].length());

    }

    public int wordsCount(String[] words, int len) {

        int count = 0;

        for(int i = 0; i < words.length; i++){
            if (words[i].length()==len)
                count++;
        }

        return count;

    }


}
