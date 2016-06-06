import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
 * In all cases remove the key "c", leaving the rest of the map unchanged.
 * <p>
 * mapShare({"b": "bbb", "c": "ccc", "a": "aaa"}) → {"b": "aaa", "a": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"d": "hi", "c": "meh", "a": "aaa"}) → {"d": "hi", "b": "aaa", "a": "aaa"}
 */
public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {

        map.remove("c");

        if (map.get("a") != null)
            map.put("b", map.get("a"));

        return map;

    }

}
