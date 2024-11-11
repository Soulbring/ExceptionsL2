public class ArrayUtils {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            System.err.println("Ошибка: массив пустой или равен null.");
            return Double.NaN;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}

