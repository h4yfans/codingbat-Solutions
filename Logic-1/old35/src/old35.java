/**
 * Created by KAAN on 21/05/2016.
 * <p>
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
 * old35(3) → true
 * old35(10) → true
 * old35(15) → false
 */
public class old35 {
    public boolean old35(int n) {

        return (n % 3 == 0 || n % 5 == 0)&& n % 15 != 0;

    }
}
