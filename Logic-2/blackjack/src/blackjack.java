/**
 * Created by KAAN on 22/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class blackjack {

    public static void main(String[] args){

        System.out.println(blackjack(21,21));

    }
    public static int blackjack(int a, int b) {

        if (a <= 21 && b > 21) return a;
        else if (b <= 21 && a > 21) return b;
        else if (a <= 21 && b <= 21) return Math.max(a, b);

        return 0;
    }


    public int blackjackSECONDWAY(int a, int b) { //   <-- This way too complicated. This example has variable and this means you have to force to RAM to keep variable to memory.
        // The value of a/b, or 0 if over 21
        int aVal = a;
        if (aVal > 21) {
            aVal = 0;
        }
        int bVal = b;
        if (bVal > 21) {
            bVal = 0;
        }

        // Now it works to just return whichever is larger.
        if (aVal > bVal) {
            return aVal;
        }
        else {
            return bVal;
        }

        // You can write a very short version of this same strategy
        // using the "ternary operator" ?: and Math.max()
    }

}
