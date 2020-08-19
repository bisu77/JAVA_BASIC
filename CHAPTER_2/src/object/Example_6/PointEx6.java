package object.Example_6;

/**
 * Created by bizplay on 2017-08-09.
 * @author KJ
 */
public class PointEx6 {
    private double x;
    private double y;

    /**
     * 원점을 설정하는 인자 없는 생성자
     * @author KJ
     */
    public PointEx6(){
        this.x = 0;
        this.y = 0;
    }
    /**
     * 특정 점으로 설정하는 생성자
     * @param x x축
     * @param y y축
     */
    public  PointEx6(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * x Getter
     * @return x값
     */
    public double getX() {
        return this.x;
    }
    /**
     * y Getter
     * @return y값
     */
    public double getY() {
        return this.y;
    }

    /**
     * 길이 이동 메소드(접근자)
     * @param x x축 이동 값
     * @param y y축 이동 값
     */
    public void translate(double x, double  y){
        this.x += x;
        this.y += y;
    }

    /**
     * 길이 비율 메소드(접근자)
     * @param ratio 길이 비율 조절
     */
    public void scale(double ratio){
        this.x *= ratio;
        this.y *= ratio;
    }
}
