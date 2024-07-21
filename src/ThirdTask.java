import java.io.*;

public class ThirdTask {

    public static void main(String[] args) {
        File file = new File("deserializationFile.txt");
        Student student1 = new Student("Fedorchuk", "RadioInformatics", 8.4);
        Student student2 = new Student("Mankevish", "RadioInformatics", 6.1);

        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(file))) {
            ois.writeObject(student1);
            ois.writeObject(student2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))) {
            Student studentRestored = (Student) reader.readObject();
            Student studentRestored2 = (Student) reader.readObject();
            System.out.println(studentRestored);
            System.out.println(studentRestored2);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
