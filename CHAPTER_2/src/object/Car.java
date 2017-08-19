package object;

/**
 * Created by bizplay on 2017-08-10.
 */
public class Car {
    private double gallons;             // 현재 연료
    private double miles;               // 주행거리
    private double fuelEfficiency;      // 연료 효율성

    /*
    * 마일, 갤런을 입력받아 연료효율성을 구하는 생성자
     */
    public Car(double gallons, double miles) {
        this.gallons = 10;                          // Default 연료
        this.miles = 0;                             // Default 주행거리
        this.fuelEfficiency = miles/gallons;        // 연료효율성(miles/gallons) = 주행거리(miles)/소모연료(gallons)
    }

    // 연료를 채우는 메서드
    public void fillGallons(double gallons){
        this.gallons += gallons;                    // 연료 증가
    }

    // 드라이브 메서드
    public void drive(double miles){
        double spendGallons = miles / this.fuelEfficiency;     // 소모연료 = 주행거리 / 연료효율성
        this.miles += miles;                                // 주행거리 증가
        this.gallons -= spendGallons;                       // 연료 감소
    }

    // 원점과 연료 레벨로 현재 거리를 구하는 메서드 (원점부터 현재까지 이동거리를 계산한 miles 반환)
    public double driveRange(){
        return this.miles;
    }

    /***************** Getter ************************/
    public double getGallons() {
        return gallons;
    }

    public double getMiles() {
        return miles;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
}