/**
 * Created by KAAN on 17/05/2016.
 * <p>
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 * <p>
 * monkeyTrouble(true, true) → true
 * monkeyTrouble(false, false) → true
 * monkeyTrouble(true, false) → false
 */
public class amras {
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));


    }

    private static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        
        if (aSmile == bSmile)
            return true;
        else
            return false;

    }

}
