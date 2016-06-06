import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of non-empty strings, return a Map<String, String> where for every different string in
 * the array, there is a key of its first character with the value of its last character.
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "n": "t", "m": "n"}
 */
public class pairs {
    public Map<String, String> pairs(String[] strings) {

        Map<String,String> map  = new HashMap<String,String>();

        for(int i = 0; i < strings.length ; i++){

            map.put(strings[i].substring(0,1),strings[i].substring(strings[i].length()-1));

        }

        return map;
    }

    public Map<String, String> pairsSECONDWAY(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String str : strings) {
            if (map.get(str) == null) map.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return map;
    }

}
