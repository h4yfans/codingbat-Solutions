/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */
public class countX {
    public int countX(String str) {

        if (str.length()==0)
            return 0;

        if (str.charAt(0)=='x')
            return 1 + countX(str.substring(1));


        return countX(str.substring(1));
    }

}
