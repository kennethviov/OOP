import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        // Create a Path object
        Path filePath = Paths.get("C:\\Users\\Documents\\myfile.txt");

        // Check if the file exists
        if (Files.exists(filePath)) {
            System.out.println("The file exists!");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
