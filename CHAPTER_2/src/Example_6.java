import object.Example_6.PointEx6;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_6 {
    public static void main(String[] args) {
        PointEx6 p = new PointEx6(3,4);
        System.out.println("x : " + p.getX() + "\ny : " + p.getY());        // 생성자로 값 입력 후 p 객체의 멤버변수 값 출력
        System.out.println();
        p.translate(1,3);
        System.out.println("x : " + p.getX() + "\ny : " + p.getY());        // translate로 값 입력 후 p 객체의 멤버변수 값 출력
        System.out.println();
        p.scale(0.5);
        System.out.println("x : " + p.getX() + "\ny : " + p.getY());        // scale로 값 입력 후 p 객체의 멤버변수 값 출력
    }
}
