import java.util.Random;
import java.util.Scanner;
/**
 * Created by bizplay on 2017-08-08.
 */

/*
* 변경자란?
* 호출 대상 객체를 변경하는 메서드
* ex) ArrayList<String> a = new ArrayList<String>();
*     a.add("ddd);
*     -> 위의 예제는 변경자이다. a 객체를 변경 시키기 때문
*/
/*
* 접근자란?
* 객체를 변경하지 않는 메서드
* ex) LocalDate date = LocalDate.of(2017,8,1);
*     date = date.plusDays(1);
*     -> 위의 예제는 접근자이다. date 객체를 변경하는 것이 아니라 새로운 LocalDate객체를 반환하는 방식이다.
 */
public class Example_2 {
    public static void main(String[] args) {
        // Scanner의 nextInt 예제
        Scanner sc = new Scanner(System.in);
        System.out.println("nextInt 는 변경자인가? 접근자인가? 전자면 1 아니면 2");
        int number = sc.nextInt();
        System.out.println(number);         // 2

        Random random = new Random();
        System.out.println(random.nextInt());       // 2
    }
}
/*
*  Scanner의 nextInt, Random의 nextInt 두 메서드 다 해당 객체를 변경하지는 않고.
*  원시타입의 int값을 반환하기 때문에 접근자이다.
*/