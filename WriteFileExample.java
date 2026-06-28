
import java.io.FileWriter;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello java");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
