import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_1 {
    public static void main(String[] args) {
        // 연습1
        Scanner sc = new Scanner(System.in);
        System.out.println("2진수/8진수/16진수로 바꿀 숫자를 입력하세요");
        int number = sc.nextInt();
        double revNumber = 1/(double)number;

        System.out.println("2진수 : " + Integer.toBinaryString(number));
        System.out.println("8진수 : " + Integer.toOctalString(number));
        System.out.println("16진수 : " + Integer.toHexString(number));

        System.out.println("역수 : " + revNumber);
        System.out.println("16진수 부동소수점 역수 : " + String.format("%e",revNumber));
    }
}
