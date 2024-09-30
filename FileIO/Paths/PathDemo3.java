import java.nio.file.*; 

public class PathDemo3 { 
    public static void main(String[] args) { 
        // Create a Path object representing the specified file path
        Path filePath = Paths.get("C:\\Users\\kenne\\OneDrive\\Documents\\Third Sem\\FileIO.txt"); 
        System.out.println("Path is " + filePath.toString()); 
        
        // Start a try-catch block to handle potential security exceptions
        try { 
            // Check if the file is both readable and executable
            if (Files.isReadable(filePath) && Files.isExecutable(filePath)) {
                System.out.println("File can be read and executed");
            } else {
                System.out.println("File cannot be used for this application");
            }
        } 
        // Catch a potential SecurityException, which may occur if access to the file is denied
        catch (SecurityException e) { 
            System.out.println("Access to the file is denied");
        }
    } 
}



