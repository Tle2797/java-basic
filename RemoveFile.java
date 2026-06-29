
import java.io.File;

public class RemoveFile {
    public static void main(String[] args) {
        try {
            File file = new File("test2.txt");
            
            if(file.exists()) {
                file.delete();
                System.out.println("File delete success");
            }else{
                System.out.println("File doest not");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
