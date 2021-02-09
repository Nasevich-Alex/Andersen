import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void sayHelloToVyacheslav() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        if (name.equals("Вячеслав"))
            System.out.println("Привет, " + name);
        else
            System.out.println("Нет такого имени");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя");
        sayHelloToVyacheslav();
    }
}
