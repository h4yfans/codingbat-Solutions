/**
 * Created by KAAN on 20/05/2016.
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

 atFirst("hello") → "he"
 atFirst("hi") → "hi"
 atFirst("h") → "h@"
 */
public class atFirst {
    public static void main(String[] args){



    }
    public String atFirst(String str) {
        if (!str.isEmpty()) {
            if (str.length()>=2){
                return str.substring(0,2);
            }else{
                return str+"@";
            }
        }
        return "@@";
    }


}
