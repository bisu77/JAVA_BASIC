package object.Example_3;

/**
 * Created by bizplay on 2017-08-09.
 */
public class PointEx3 {
    private double x;
    private double y;

    // 원점을 설정하는 인자 없는 생성자
    public PointEx3(){
        this.x = 0;
        this.y = 0;
    }
    // 특정 점으로 설정하는 생성자
    public PointEx3(double x, double y){
        this.x = x;
        this.y = y;
    }

    // getter
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    // 길이 이동 메소드(변경자)
    public boolean translate(double x, double  y){
        double checkX = this.x + x;
        double checkY = this.y + y;

        if(checkX < 0 || checkY < 0){
            // 음수일 경우 return false;
            return false;
        }

        this.x += x;
        this.y += y;
        return true;
    }

    // 길이 비율 메소드(변경자)
    public void scale(double ratio){
        this.x *= ratio;
        this.y *= ratio;
    }

    public void printXY(){
        System.out.println("---------------------printXY메소드-------------------------------");
        System.out.println("X : " + this.x);
        System.out.println("Y : " + this.y);
    }
}
