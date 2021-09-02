import java.io.File;
import java.io.IOException;

public class JavaApplication13 {

    public static void main(String[] args) {

        File file   = new File("text.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

    }

}
