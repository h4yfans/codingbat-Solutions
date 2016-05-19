/**
 * Created by KAAN on 19/05/2016.
 * <p>
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * <p>
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("ya"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("kitten"));


    }

    public static String altPairs(String str) {
        String s = "";
            for (int i = 0; i < str.length();  i += 4) {
                int end = i + 2;
                s += str.substring(i,Math.min(end,str.length())); // this line will compare str.length and i + 2.      i.e: i+2=5 and str.length = 3 min = str.length
            }
            return s;

    }
}

