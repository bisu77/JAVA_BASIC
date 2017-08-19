package object.Example_5;

/**
 * Created by bizplay on 2017-08-08.
 * @author KJ
 */
public class PointEx5 {
    private double x;
    private double y;

    /**
     * 원점을 설정하는 인자 없는 생성자
     * @author KJ
     */
    public PointEx5(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * 특정 점으로 설정하는 생성자
     * @param x x축
     * @param y y축
     */
    public PointEx5(double x, double y){
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
     * @param x x 이동 값
     * @param y y 이동 값
     * @return PointEx5
     */
    public PointEx5 translate(double x, double  y){
        double sumX = this.x + x;
        double sumY = this.y + y;
        return create(sumX,sumY);
    }

    /**
     * 길이 비율 메소드(접근자)
     * @param ratio 길이 비율 조절
     * @return PointEx5
     */
    public PointEx5 scale(double ratio){
        double ratioX = this.x * ratio;
        double ratioY = this.y * ratio;
        return create(ratioX,ratioY);
    }

    /**
     * PointEx5 생성자 메소드
     * @param x x값
     * @param y y값
     * @return PointEx5
     */
    public PointEx5 create(double x, double y){
        return new PointEx5(x,y);
    }
}
