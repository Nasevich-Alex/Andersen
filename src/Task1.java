import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”

Автор Насевич А.М.
*/

public class Task1 {
    public static void printHello() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 7)
            System.out.println("Привет");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите целое число");
        printHello();
    }
}