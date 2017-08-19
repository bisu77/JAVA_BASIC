import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_14 {
    public static void main(String[] args) {
        System.out.println("매직스퀘어 입력(공백으로 Enter 입력 시 종료)");
        int magicSquare[][] = new int[100][];
        int count = 0;
        while(true){
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            if("".equals(data)){                // 공백Enter시 종료
                break;
            }
            String[] arrData = data.split(" ");
            int[] rowData = new int[arrData.length];
            for(int i=0;i<arrData.length;i++){
                rowData[i] = Integer.parseInt(arrData[i]);
            }
            magicSquare[count++] = rowData;
        }
        for(int i=0;i<magicSquare.length;i++){
            for(int j=0;j<magicSquare[i].length;j++){
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("종료");
    }
}
