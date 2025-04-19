import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {

        LocalDate localDate = LocalDate.of(2025, 1, 1);
        LocalDate localDate1 = localDate.withYear(2026);
        LocalDate localDate2 = localDate.withMonth(2);
        LocalDate localDate3 = localDate.withDayOfMonth(2);
        LocalDate localDate4 = localDate.withYear(2027).withMonth(5).withDayOfMonth(2);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
    }
}