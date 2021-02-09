/*
Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

Автор Насевич А.М.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : array) {
            if (j % 3 == 0)
                System.out.println(j);
        }
    }
}
