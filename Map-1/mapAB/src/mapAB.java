import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together and store the result under the key "ab".
 *
 * mapAB({"b": "There", "a": "Hi"}) → {"b": "There", "a": "Hi", "ab": "HiThere"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */
public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b"))
            map.put("ab",map.get("a")+map.get("b"));

        
        return map;

    }

}
