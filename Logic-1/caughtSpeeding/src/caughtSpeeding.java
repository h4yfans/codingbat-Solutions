/**
 * Created by KAAN on 21/05/2016.
 * You are driving a little too fast, and a police officer stops you.
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
 * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more,
 * the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 * caughtSpeeding(60, false) → 0
 * caughtSpeeding(65, false) → 1
 * caughtSpeeding(65, true) → 0

 */
public class caughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {

            if (isBirthday){
                int plus5 = speed +5;
                if (plus5<=60) return 0;
                if (plus5>=61 && plus5<=80) return 1;
                if (plus5>81) return 2;
            }else{
                if (speed<=60) return 0;
                if (speed>=61 && speed<=80) return 1;
            }

        return 2;

    }

}
