/*********************************************************
 * RandomTest.java - example from the book               *
 *                                                       *
 * This Program demonstrates methods of the Random class.*
 *********************************************************/
import java.util.Random;

public class RandomTest {
    public static void main(String[] args)
    {
        Random random = new Random();

        System.out.println(random.nextInt(Integer.MAX_VALUE));
        System.out.println(5.0 + 8.0 * random.nextGaussian());
    }
}
