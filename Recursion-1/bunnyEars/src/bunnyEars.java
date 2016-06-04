/**
 * Created by Kaan Karaca on 04/06/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * <p>
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 * bunnyEars(0) → 0
 * bunnyEars(1) → 2
 * bunnyEars(2) → 4
 */
public class bunnyEars {
    public int bunnyEars(int bunnies) {

        // return bunnies*2; Just this code line will solve the problem
        // But this problem wants to know how to use recursion.

        if (bunnies == 0) return 0;
        
        return 2+ bunnyEars(bunnies-1);


    }

}
