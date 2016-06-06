import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
 * with the value of all the strings starting with that character appended together in the order they appear in the array.
 * firstChar(["salt", "tea", "soda", "toast"]) → {"t": "teatoast", "s": "saltsoda"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"d": "d", "b": "bb", "c": "cccCC", "a": "aaaAA"}
 */
public class firstChar {
    public Map<String, String> firstChar(String[] strings) {

        Map<String,String> map = new HashMap<String, String>();

        for(String str: strings){
            if (map.get(str.substring(0,1))!=null){
                String tail = map.get(str.substring(0,1)) + str;
                map.put(str.substring(0,1),tail);
            }else{
                map.put(str.substring(0,1),str);
            }
        }

        return map;

    }

}
