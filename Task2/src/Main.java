import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String result = PalindromeChecker.isPalindrome(input);
        System.out.println(result);
    }
}
