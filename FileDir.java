import java.io.File;

public class FileDir {
    public static void main(String[] args) {
        File file = new File(".");
        String[] files = file.list();

        System.out.println("File in directotry: " + file.getAbsolutePath());

        for (String f : files) {
            System.out.println(f);
        }
    }
}
