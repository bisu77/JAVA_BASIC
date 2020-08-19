import java.util.Random;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_10 {
    public static void main(String[] args) {
        // 연습10
        Random random = new Random();
        long number = random.nextLong();
        String str = Long.toString(number,36);
        System.out.println(str);
    }
}
