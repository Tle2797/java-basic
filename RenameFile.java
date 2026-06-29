import java.io.File;
import java.io.FileWriter;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.exists()) {
            file.renameTo(new File("test2.txt"));
            System.out.println("File Renamed to test2.txt");
        }else{
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter(file);
                writer.write("Hello java");
                writer.close();

                file.renameTo(new File("test2.txt"));
                System.out.println("File renamed to test2.txt");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
