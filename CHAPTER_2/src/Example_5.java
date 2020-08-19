import object.Example_5.PointEx5;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_5 {
    public static void main(String[] args) {
        PointEx5 p = new PointEx5(3,4).translate(1,3).scale(0.5);
        System.out.println("x : " + p.getX() + "\ny : " + p.getY());
    }
}
