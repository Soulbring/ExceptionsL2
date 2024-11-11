import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате YYYY-MM-DD:");
        String dateString = scanner.nextLine();

        String result = DateValidator.validateDate(dateString);
        System.out.println(result);
    }
}
