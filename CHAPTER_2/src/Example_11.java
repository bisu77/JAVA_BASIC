
import java.time.*;
import static java.time.LocalDate.*;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_11 {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);       // 정적 import 사용으로 인해 클래스명 없이 정적메서드 사용
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = of(year, month, 1);                  // 정적 import 사용으로 인해 클래스명 없이 정적메서드 사용
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
