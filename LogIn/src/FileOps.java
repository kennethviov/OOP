package src;

import java.util.*;
import java.io.*;

public class FileOps {
   
   HashMap<String, String> users;
   
   public FileOps () {
   
   }
   
   public HashMap<String, String> readFile() {
      HashMap<String, String> accounts = new HashMap<>();
      
      try (BufferedReader br = new BufferedReader(new FileReader("res/texts/users.txt"))) {
         String user;
         while ((user = br.readLine()) != null) {
            String pass = br.readLine();
            if (pass != null) {
               accounts.put(user, pass);
            }
         }
      } catch (IOException e) {
         e.printStackTrace();
      }

      return accounts;
   }
   
   public void writeToFile(HashMap<String, String> users) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("res/texts/users.txt"))) {
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey());   // Write the key
                writer.newLine();               // New line after key
                writer.write(entry.getValue()); // Write the value
                writer.newLine();               // New line after value
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
}
