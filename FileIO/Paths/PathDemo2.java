import java.util.Scanner; 
import java.nio.file.*; 

public class PathDemo2 { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 

        System.out.println();

        System.out.print("Enter a file name >> "); 
        String name = scan.nextLine(); 
        
        // Create a Path object from the user-provided file name
        Path inputPath = Paths.get(name); 
        // Convert the relative path to an absolute path
        Path fullPath = inputPath.toAbsolutePath(); 
        // Display the full absolute path as a string
        System.out.println("Full path is " + fullPath.toString());
        System.out.println();

        scan.close();
    } 
}


