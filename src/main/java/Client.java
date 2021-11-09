import files.File;
import files.ImageFile;
import files.TextFile;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();

        File file1 = new TextFile("text1.txt", "/", 760, "Ansi");
        files.add(file1);
        files.add(file1.clone());

        File file2 = new ImageFile("image1.jpg", "images/", 2500, ImageFile.ImageFormat.JPEG);
        files.add(file2);
        files.add(file2.clone());

        for (File file : files) {
            System.out.println(file);
        }
    }
}
