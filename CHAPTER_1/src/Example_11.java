import java.util.Scanner;

/**
 * Created by bizplay on 2017-08-05.
 */
public class Example_11 {
    public static void main(String[] args) {
        // 연습11
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        String str = sc.nextLine();
        System.out.println(convert(str));
    }
    public static String convert(String str) {
        StringBuffer ostr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 유니코드로 변환할 필요가 있는 문자열인지 판단
            if ((ch >= 0x0020) && (ch <= 0x007e)) {
                ostr.append(ch); // 아닌 경우.
            } else { // 변경해야 하는 경우.
                ostr.append("\\u");
                String hex = Integer.toHexString(str.charAt(i) & 0xFFFF); // 문자의 Hex 값

                // 네 자리를 맞추기 위해 0 추가
                for (int j = 0; j < 4 - hex.length(); j++)
                    ostr.append("0");

                ostr.append(hex.toLowerCase());
            }
        }
        return (new String(ostr));
    }
}
