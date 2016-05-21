/**
 * Created by KAAN on 21/05/2016.
 * <p>
 * The squirrels in Palo Alto spend most of the day playing. In particular,
 * they play if the temperature is between 60 and 90 (inclusive).
 * Unless it is summer, then the upper limit is 100 instead of 90.
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
 * squirrelPlay(70, false) → true
 * squirrelPlay(95, false) → false
 * squirrelPlay(95, true) → true
 */
public class squirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        } else if (isSummer && temp >= 90 && temp <= 100)
            return true;

        return false;

    }//        return isSummer && temp <= 100 && temp >= 60 || temp <= 90 && temp >= 60;


}
