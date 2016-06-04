/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 * countAbc("abc") → 1
 * countAbc("abcxxabc") → 2
 * countAbc("abaxxaba") → 2
 */
public class countAbc {
    public int countAbc(String str) {

        if (str.length()<3) return 0;

        if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
            return 1 + countAbc(str.substring(1));



        return countAbc(str.substring(1));
    }



}
