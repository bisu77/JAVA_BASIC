import org.omg.CORBA.IntHolder;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_4 {
    public static void main(String[] args) {
        /*
         * 자바에서 두 int 변수의 내용을 맞바꾸는 메서드를 구현할 수 없는 이유?
         * temp 변수가 없으면 맞바꿀 수가 없다.
         * 왜냐하면, int 변수가 갖고있는 비트 값을 한번에 맞바꿀 수는 없기 때문
         * 원시타입의 int가 아닌 IntHolder 객체도 마찬가지이다.
         */
        IntHolder intHolder1 = new IntHolder(1);
        IntHolder intHolder2 = new IntHolder(2);

        System.out.println(intHolder1.value);
        System.out.println(intHolder2.value);
    }
}
