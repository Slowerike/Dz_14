import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,StandardCharsets.UTF_8);
        System.out.println("Введите строку для добавление ее в файл tms.txt:");
        String stroka = scanner.nextLine();
        File file = new File("tms.txt");
        // Запись в файл
        try (FileOutputStream os = new FileOutputStream(file)) {
            os.write(stroka.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Чтение из файла и вывод
        try (FileInputStream stream = new FileInputStream(file)) {
            byte[] buffer = new byte[(int) file.length()];
            int bytesRead = stream.read(buffer);
            String content = new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);

            // Замена пробелов на подчеркивания и вывод
            content = content.replace(' ', '_');
            System.out.print(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}