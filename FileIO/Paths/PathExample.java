import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.io.IOException;

public class PathExample {
    public static void main(String[] args) {
        // Create a Path using Paths.get()
        Path path1 = Paths.get("C:\\Users\\kenne\\OneDrive\\Desktop\\2ndYear1stSem\\codes\\OOPROG\\FileIO\\FileIO.txt");

        // Display the full path as a string using toString()
        System.out.println("Full Path using Paths.get(): " + path1.toString());

        // Get the default FileSystem
        FileSystem fs = FileSystems.getDefault();

        // Create another Path using the FileSystem object
        Path path2 = fs.getPath("C:\\\\Users\\\\kenne\\\\OneDrive\\\\Desktop\\\\2ndYear1stSem\\\\codes\\\\OOPROG\\\\FileIO\\\\FileIO.txt");

        // Display the full path created using the FileSystem
        System.out.println("Full Path using FileSystem: " + path2.toString());

        // Check if the file exists using the Files class
        try {
            if (Files.exists(path1)) {
                System.out.println("The file exists at: " + path1);
            } else {
                System.out.println("The file does not exist at: " + path1);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Using Path methods with path1
        // 1. Get the file name
        System.out.println("File Name: " + path1.getFileName());

        // 2. Get the number of elements (name count) in the path
        System.out.println("Number of elements in the path: " + path1.getNameCount());

        // 3. Get each part of the path by index
        for (int i = 0; i < path1.getNameCount(); i++) {
            System.out.println("Element at index " + i + ": " + path1.getName(i));
        }
    }
}
