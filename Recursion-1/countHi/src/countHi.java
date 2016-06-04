/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */
public class countHi {
    public int countHi(String str) {

        if (str.length() < 2) return 0;

        if (str.substring(0,2).equals("hi"))
            return 1+ countHi(str.substring(2));


        return countHi(str.substring(1));



    }

}
