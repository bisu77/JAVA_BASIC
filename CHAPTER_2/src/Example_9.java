import object.Car;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_9 {
    public static void main(String[] args) {
        Car car = new Car(1.0, 2.5);         // 1 gallon으로 2.5mile가는 연비를 가진 자동차 생성
        System.out.println("현재 연료 : " + car.getGallons());                // default 10
        System.out.println("현재 주행거리 : " + car.driveRange());            // default 0
        System.out.println("자동차 연비 : " + car.getFuelEfficiency());       // 연비 2.5m/g

        car.drive(15);           // 15 마일 드라이브~
        System.out.println("------------------15 마일 드라이브-------------------------");
        System.out.println("현재 연료 : " + car.getGallons());
        System.out.println("현재 주행거리 : " + car.driveRange());
        System.out.println("자동차 연비 : " + car.getFuelEfficiency());

        car.fillGallons(8);
        System.out.println("------------------8 갤런 주유-------------------------");
        System.out.println("현재 연료 : " + car.getGallons());
        System.out.println("현재 주행거리 : " + car.driveRange());
        System.out.println("자동차 연비 : " + car.getFuelEfficiency());

        car.drive(17);
        System.out.println("------------------17 마일 드라이브-------------------------");
        System.out.println("현재 연료 : " + car.getGallons());
        System.out.println("현재 주행거리 : " + car.driveRange());
        System.out.println("자동차 연비 : " + car.getFuelEfficiency());

        /*
        * Car 클래스를 변하는 클래스(변경자 메서드를 이용하여 객체 변경)로 만든 이유 :
        * 1. 현실세계를 객체화 한 객체지향 개념에서의 자동차라는 클래스를 이동하거나 주유할 때마다 새로운 차를 반환하는게 현실세계와 맞지 않음.
        * 2. 접근자 메서드를 사용해 매번 새로운 객체를 반환하게 되면 JVM에서 사용하지 않는 메모리를 알아서 관리 한다고 하지만,
        *    결국에는 이것 또한 메모리 효율성이 좋을거 같지 않음.
        * 3. 책에서는 동시에 한 객체를 변경하는 것이 위험하기 때문에 접근자메서드를 사용한다고 하지만 웹에서는 클라이언트가 서버에 붙을 때
        *    하나의 스레드를 생성하기 때문에 동시에 한 객체를 변경하는 것이 불가능 하다고 생각.
        *    (같은 스레드를 공유하여 객체 변경이 위험할 수 있는 경우가 있을까? 있다면 같은 스레드를 공유하는 경우는 어떤 경우일까?)
         */
    }
}
