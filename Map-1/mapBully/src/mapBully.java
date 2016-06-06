import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
 * and set the key "a" to have the value "". Basically "b" is a bully, taking the value of "a".
 * <p>
 * mapBully({"b": "dirt", "a": "candy"}) → {"b": "candy", "a": ""}
 * mapBully({"a": "candy"}) → {"b": "candy", "a": ""}
 * mapBully({"b": "carrot", "c": "meh", "a": "candy"}) → {"b": "candy", "c": "meh", "a": ""}
 */
public class mapBully {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("b", "carrot");
        map.put("c", "meh");
        map.put("a", "candy");

        String temp = map.get("a");

        System.out.println(map.get("a"));
    }


    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.get("a") != null){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;


    }

}


