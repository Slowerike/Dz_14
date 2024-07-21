import java.io.*;


public class SecondTask {
    public static void main(String[] args) {
        File file = new File("tms2.txt");
        try (FileWriter f = new FileWriter(file)) {
            f.write("Cognosce te ipsum");
            f.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
        try (FileReader f = new FileReader(file)) {
            int i = f.read();
            System.out.println((char) i);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
    }
}
