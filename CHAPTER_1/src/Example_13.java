import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_13 {
    public static void main(String[] args) {
        int[][] lotto = {
            {1,2,3,4,5,6,7},
            {8,9,10,11,12,13,14},
            {15,16,17,18,19,20,21},
            {22,23,24,25,26,27,28},
            {29,30,31,32,33,34,35},
            {36,37,38,39,40,41,42},
            {43,44,45,46,47,48,49}
        };                                  // 2차원 배열 로또번호 생성
        int[][] response = new int[6][6];   // 로또 구매자가 선택한 번호 저장 배열 생성
        int count = 0;                      // count 변수
        while(true){
            try {
                if(count==6){              // 로또 6줄 까지 하면 마지막으로 정렬된 로또 번호 출력 후 종료
                    lastMessage(response);
                    break;
                }
                if(firstMessage(lotto,response,count)){  // 로또 숫자 6개 입력받고 중복값 없으면 사용자 선택 배열에 정렬하여 데이터 담은 후 count 1증가
                    count++;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return ;
    }
    public static boolean firstMessage(int[][] lotto, int[][] response,int count) throws Exception{
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(lotto[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println((count+1) +"번째 로또입니다. 서로 다른 숫자 6개 고르세요.");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] choiceString = data.split(" ");

        // 6개 숫자를 입력하지 않았을 때
        if(choiceString.length!=6){
            System.out.println("\n******* 경고 **********\n숫자 6개를 입력하세요.");
            return false;
        }
        // 선택 값 담기
        for(int i=0;i<choiceString.length;i++){
            response[count][i] = Integer.parseInt(choiceString[i]);
        }
        // 중복 검사
        for(int i=0;i<choiceString.length;i++){
            for(int j=0; j<i;j++){
                if(response[count][i]==response[count][j]){
                    System.out.println("\n******* 경고 **********\n중복된 숫자입니다. 중복되지 않는 숫자 6개를 입력하세요.");
                    return false;
                }
            }
        }
        insortionSort(response[count]);     // 삽입정렬
        // bubbleSort(response[count]);        // 버블정렬
        // selectionSort(response[count]);     // 선택정렬
        return true;
    }
    // 삽입정렬
    public static void insortionSort(int[] a){
        int size = a.length;
        for(int i=1; i<size; i++) {
            int temp = a[i];
            int j = i;
            while((j>0) && (a[j-1]>temp)) {
                a[j] = a[j-1];
                j--;
            }

            a[j] = temp;
            /*System.out.printf("\n삽입정렬 %d 단계 : ",i);
            for(int v : a) {
                System.out.printf("%d ", v);
            }*/
        }
    }
    // 버블정렬
    public static void bubbleSort(int[] a) {
        int size = a.length;
        for(int i=size-1; i>0; i--) {
           // System.out.printf("\n버블 정렬 %d 단계 : ", size-i);
            for(int j=0; j<i; j++) {
                if(a[j] > a[j+1]) {
                    swap(a,j,j+1);
                }
                /*System.out.printf("\n\t");
                for(int v : a) {
                    System.out.printf("%3d ", v);
                }*/
            }
        }
    }
    // 선택정렬
    public static void selectionSort(int[] a) {
        for(int i=0; i<a.length-1; i++) {
            int min = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[j] < a[min]) { //오름차순
                    min = j;
                }
            }
            swap(a, min, i);
            /*System.out.printf("\n선택 정렬 %d 단계 : ", i+1);
            for(int v : a) {
                System.out.printf("%3d ", v);
            }*/
        }
    }
    public static void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    public static void lastMessage(int[][] response){
        for(int i=0;i<response.length;i++){
            System.out.print((i+1) +"번째 로또 : ");
            for(int j=0;j<response[i].length;j++){
                System.out.print(response[i][j]+ " ");
            }
            System.out.println();
        }
    }
}