import java.io.*;

public class Buffers {
    public static void main(String[] args) {
        File originalFile = new File("C:\\Users\\kenne\\OneDrive\\Documents\\Files\\bufferInput.txt");
        File copiedFile = new File("C:\\Users\\kenne\\OneDrive\\Documents\\Files\\bufferOutput.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(copiedFile))) {
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));

            System.out.println("Original file contents: ");

            // copying contents line by line
            String line;
                   //line = reader.readLine() reads the contents from the file and stores the String in "line"
            while  ((line = reader.readLine()) != null) {
                System.out.println(line); //prints the contents
                writer.write(line); // writing the read line into copiedFile
                writer.newLine(); // new line since readline doesn't read "\n"
            }

            writer.flush(); // flushing the bufferedWriter to ensure all data is written to the file
            reader.close();

            System.out.println("\nFile successfully copied");

            reader = new BufferedReader(new FileReader(copiedFile));
            System.out.println("\nCopied file contents: ");
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: One of the files was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("An I/O error occured during file operation.");
            e.printStackTrace();
        }
    }
}



