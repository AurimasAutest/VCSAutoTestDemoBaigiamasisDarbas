import java.time.DayOfWeek;
import java.time.LocalDate;

public class Classvork {

    public static void main(String[] args) {
        DayOfWeek actualWeekDay = LocalDate.now().getDayOfWeek();
        System.out.println(actualWeekDay);

    }
}
