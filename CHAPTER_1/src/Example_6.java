import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_6 {
    public static void main(String[] args) {
        // 연습6
        Scanner sc = new Scanner(System.in);
        System.out.println("팩토리얼을 구합니다. 숫자 하나를 입력해주세요.");
        int number = sc.nextInt();
        BigInteger bigInteger = BigInteger.valueOf(1);

        for(int i=1;i<=number;i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        System.out.println(number + " 팩토리얼 : " + bigInteger);

    }
}
