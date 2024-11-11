import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    public static String validateDate(String dateString) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate date = LocalDate.parse(dateString, dateFormatter);
            LocalDate minDate = LocalDate.of(1, 1, 1);
            LocalDate maxDate = LocalDate.of(9999, 12, 31);
            if (date.isBefore(minDate) || date.isAfter(maxDate)) {
                return "Дата выходит за допустимые пределы (0001-01-01 до 9999-12-31)";
            }
            return "Корректная дата: " + date.toString();
        } catch (DateTimeParseException e) {
            return "Некорректный формат даты. Ожидается формат YYYY-MM-DD.";
        }
    }
}
