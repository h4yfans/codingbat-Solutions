import oracle.jrockit.jfr.StringConstantPool;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by KAAN on 18/05/2016.
 * <p>
 * <p>
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
 * <p>
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class amras {
    public static void main(String[] args) {

        System.out.println("kaankaraca.".substring(0, "kaankaraca".length()));
        System.out.println(frontTimes("Ab", 4));
        System.out.println(frontTimes(frontTimes("Abc", 3);
        System.out.println(frontTimes("Chocolate", 3));

    }

    public static String frontTimes(String str, int n) {

        String newS = "";
        if (n >= 0) {
            if (str.length() >= 3) {
                for (int i = 0; i < n; i++) {
                    newS = newS + str.substring(0, 3);
                }return newS;
            }else{
                for(int i = 0; i < n ; i++){
                    newS = newS + str;
                }return newS;
            }
        }
        return str;

}