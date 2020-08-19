import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_3 {
    public static void main(String[] args) {
        //연습3-1(조건연산자)
        Scanner sc = new Scanner(System.in);
        System.out.println("최대값을 구합니다. 숫자 3개를 입력하세요.");
        int[] number = new int[3];
        int max = 0;
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        if(strArray.length>3){
            System.out.println("숫자 3개를 입력하셔야 합니다.");
            return ;
        }
        for(int i=0;i<strArray.length;i++){
            number[i] = Integer.parseInt(strArray[i]);
        }
        max = (number[0]>number[1]) ? number[0] : number[1];
        max = (max >number[2]) ? max : number[2];

        System.out.println("최대값 : " + max);

        // 연습3-2(Math.max사용)
        /*Scanner sc = new Scanner(System.in);
        System.out.println("최대값을 구합니다. 숫자 3개를 입력하세요.");
        int[] number = new int[3];
        int max = 0;
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        if(strArray.length>3){
            System.out.println("숫자 3개를 입력하셔야 합니다.");
            return ;
        }
        for(int i=0;i<strArray.length;i++){
            number[i] = Integer.parseInt(strArray[i]);
        }
        max = Math.max(number[0],number[1]);
        max = Math.max(max,number[2]);

        System.out.println("최대값 : " + max);*/
    }
}
