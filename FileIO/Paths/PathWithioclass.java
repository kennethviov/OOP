import java.io.*;

public class PathWithioclass {
    public static void main(String[] args) {
        // Creating a file path using the File class
        File file = new File("example" + File.separator + "file.txt");
        
        // Display the path
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Is Absolute: " + file.isAbsolute());
    }
}
