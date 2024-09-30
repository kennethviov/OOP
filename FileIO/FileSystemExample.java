import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {
    public static void main(String[] args) {
        // Get the default FileSystem
        FileSystem fileSystem = FileSystems.getDefault();

        System.out.println("Default: " + fileSystem);

        // Use the FileSystem to create a Path
        Path filePath = fileSystem.getPath("C:\\Users\\Documents\\myfile.txt");

        // Display the path
        System.out.println("Path: " + filePath);

        // You can access some details about the file system
        System.out.println("File Separator: " + fileSystem.getSeparator());

        // Display the root directories in the file system
        for (Path root : fileSystem.getRootDirectories()) {
            System.out.println("Root Directory: " + root);
        }
    }
}
