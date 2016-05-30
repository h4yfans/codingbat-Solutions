/**
 * Created by Kaan Karaca on 30/05/2016.
 * github.com/h4yfans
 * kaan94karaca@gmail.com
 * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
 * Consider the series of numbers beginning at start and running up to but not including end,
 * so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
 * except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java,
 * String.valueOf(xxx) will make the String form of an int or other type.
 * This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing,
 * and we vary the start/end instead of just always doing 1..100.
 * <p>
 * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
 * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
 * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
 */
public class fizzBuzz {

    public String[] fizzBuzz(int start, int end) {
        int len = end - start;
        String[] newArr = new String[len];

        for (int i = 0; i < len; i++) {

            if (start % 15 == 0)
                newArr[i] = "FizzBuzz";
            else if (start % 3 == 0)
                newArr[i] = "Fizz";
            else if (start % 5 == 0)
                newArr[i] = "Buzz";
            else
                newArr[i] = String.valueOf(start);


            start++;
        }
        return newArr;
    }

}
