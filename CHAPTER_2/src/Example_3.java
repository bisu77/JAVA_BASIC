import object.Example_3.PointEx3;

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
public class Example_3 {
    public static void main(String[] args) {
        /* void 외의 것을 반환하는 변경자 메서드 */
        PointEx3 pointEx3 = new PointEx3(3, 5);

        System.out.println("X : " + pointEx3.getX());
        System.out.println("Y : " + pointEx3.getY());

        if(pointEx3.translate(-7,-5)){              // 결과 값이 음수이면 false를 반환하는 변경자 메서드이다. (결과값이 양수 인경우 객체값을 변경하니 변경자 메서드이다.)
            System.out.println("객체 변경 성공");
        }else{
            System.out.println("객체 변경 실패");
        }

        System.out.println("--------------수정결과------------------");
        System.out.println("X : " + pointEx3.getX());
        System.out.println("Y : " + pointEx3.getY());

        /* void를 반환하는 접근자 메서드 */
        pointEx3.printXY();                 // 객체에 접근하여 단순 sout으로 출력하는 메소드이다.(객체를 변경하지 않고 접근하니 접근자 메서드이다)
    }
}
