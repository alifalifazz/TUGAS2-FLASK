
6c:\Users\ASUS\Alifa Izzatunnisa\JavaLanjut\Output.java�import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Out {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.println("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}g gh	h� 