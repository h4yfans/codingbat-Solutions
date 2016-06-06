import java.util.Map;

/**
 * Created by Kaan Karaca on 06/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 *
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
 * set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
 *
 * topping3({"potato": "ketchup"}) → {"fries": "ketchup", "potato": "ketchup"}
 * topping3({"potato": "butter"}) → {"fries": "butter", "potato": "butter"}
 * topping3({"salad": "oil", "potato": "ketchup"}) → {"salad": "oil", "fries": "ketchup", "spinach": "oil", "potato": "ketchup"}
 */
public class topping3 {
    public Map<String, String> topping3(Map<String, String> map) {

        if (map.get("potato")!=null)
            map.put("fries",map.get("potato"));

        if (map.get("salad")!=null)
            map.put("spinach",map.get("salad"));

        return map;

        
    }

}
