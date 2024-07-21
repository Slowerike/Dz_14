import java.io.*;


import static java.nio.charset.StandardCharsets.*;


public class Homework_1 {
    public static void main(String[] args) {
        File f = new File("RomeoAndJullieta.txt");
        File theMostLengthWord = new File("TheMostLengthWordFromRomeoAndJullieta.txt");
        String res="";
        String result;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), UTF_8))) {
            int lengthLine = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                String [] lines = line.split("[\\s,.]+");
                for (String s : lines) {
                    if (s.length() > lengthLine) {
                        lengthLine = s.length();
                        res = s;
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(theMostLengthWord)))) {
            writer.write(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(theMostLengthWord), UTF_8))) {
            while ((result = reader.readLine()) != null) {
                System.out.println(result);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
