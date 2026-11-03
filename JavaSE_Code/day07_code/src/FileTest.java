import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("d:\\1.txt");

        System.out.println(f.exists());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
    }
}
