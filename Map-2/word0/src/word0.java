import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated
 * counting later, but for this problem the value is simply 0.
 * word0(["a", "b", "a", "b"]) → {"b": 0, "a": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"b": 0, "c": 0, "a": 0}
 * word0(["c", "b", "a"]) → {"b": 0, "c": 0, "a": 0}
 */
public class word0 {
    public Map<String, Integer> word0(String[] strings) {

        Map<String,Integer> map = new HashMap<String, Integer>();

        for(String s: strings){
            if (!map.containsKey(s))
                map.put(s,0);
        }

        return map;

    }

}
