import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);     // 현재 날짜 세팅
        int month;
        if (args.length >= 2) {                                 // 년도/월 입력받으면 다시 세팅
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {                                                // 현재 월 반환
            month = date.getMonthValue();
        }

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue() % 7)+1; // 1 = Monday, ... 7 = Sunday   =>  1 = Sunday ... 7 = Saturday
        for (int i = 1; i < value; i++)         // 1일이 무슨 요일이냐에 따라 요일당 공백x4 추가
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());     // 해당 월 날짜 출력
            date = date.plusDays(1);                            // 1일씩 증가 시킴
            if (date.getDayOfWeek().getValue() == 7)            // 일요일 이면 한칸 띄움
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 7)                // 마지막 날짜가 일요일이 아니면 한칸 띄움(일요일은 while문에서 한칸 띄워지기 때문)
            System.out.println();
    }
}
