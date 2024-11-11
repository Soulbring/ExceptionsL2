public class Main {
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "cherry", "date"};

        // Сортировка основного массива
        String[] sortedArray = StringArraySorter.sortStringArray(array);
        System.out.println("Отсортированный массив:");
        for (String str : sortedArray) {
            System.out.println(str);
        }
        
    }
}
