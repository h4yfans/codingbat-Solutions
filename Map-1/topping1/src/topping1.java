import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is
 * present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 * topping1({}) → {"bread": "butter"}
 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */
public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread","butter");

        if (map.containsKey("ice cream"))
            map.put("ice cream","cherry");


        return map;

    }

}
