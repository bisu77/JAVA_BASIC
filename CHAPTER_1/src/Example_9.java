/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_9 {
    public static void main(String[] args) {
        // 연습9
        // substring(부분문자열)을 사용하지 않고 문자열을 포함하고 있지만 다른 값들을 비교하는 예를 제시)
        String s = "Hello World";
        String t = "Hello ";

        /*
         * contains메소드(해당 문자열을 포함하고 있는 지 여부 반환)
         */
        System.out.println(s.contains(t));
    }
}
