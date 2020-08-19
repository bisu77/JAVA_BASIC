/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_12 {
    public static void main(String[] args) {
        /*
            1. ch01/sec 패키지에 HelloWorld.java 생성
            2. HelloWorld.java 파일 object 폴더로 이동
            3. object폴더에서 javac 컴파일
            4. 이 때 HelloWorld.class  파일이 어디 생겼는가? -> object 폴더에 생김
            5. 그러면 java HelloWorld 명령으로 실행해보자 -> 기본클래스 HelloWorld를 찾거나 로드할 수 없다는 에러메시지 출력
            6. javap HelloWorld 명령으로 경고메시지를 연구해보자 -> public class sec01.HelloWorld extends java.lang.Object 형식으로 클래스 선언문 출력
            7. 즉, 위와 같은 에러메시지가 출력된 이유는 HelloWorld는 sec01 패키지의 클래스로 컴파일 되어있기 때문에 HelloWorld클래스를 로드할 수 없었다.
            8. 마지막으로 javac -d . HelloWorld.java 명령 실행해보아라.
            9. 현재 위치(object폴더)에서 sec01 폴더가 생성된 후 HelloWorld.class파일이 생성되었다.
         */
    }
}
