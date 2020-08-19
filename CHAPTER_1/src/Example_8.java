import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_8 {
    public static void main(String[] args) {
        // 연습8
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        for(int i=0; i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
    }
}
