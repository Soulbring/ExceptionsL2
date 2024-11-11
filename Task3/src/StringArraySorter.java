import java.util.Arrays;

public class StringArraySorter {
    public static String[] sortStringArray(String[] array) {
        if (array == null) {
            System.err.println("Ошибка: входной массив равен null.");
            return new String[0];
        }

        try {
            Arrays.sort(array);
        } catch (Exception e) {
            System.err.println("Ошибка при сортировке массива: " + e.getMessage());
            return new String[0];
        }

        return array;
    }
}
