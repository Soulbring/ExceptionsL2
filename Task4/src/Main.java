public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        double average = ArrayUtils.calculateAverage(array);
        System.out.println("Среднее значение: " + average);

        // Проверка для пустого массива
        int[] emptyArray = {};
        double emptyAverage = ArrayUtils.calculateAverage(emptyArray);
        System.out.println("Среднее значение для пустого массива: " + emptyAverage);

        // Проверка для null массива
        int[] nullArray = null;
        double nullAverage = ArrayUtils.calculateAverage(nullArray);
        System.out.println("Среднее значение для null массива: " + nullAverage);
    }
}
