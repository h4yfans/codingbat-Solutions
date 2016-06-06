import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a
 * key for each different string, with the value the number of times that string appears in the array.
 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class wordCount {
    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;

    }

}
