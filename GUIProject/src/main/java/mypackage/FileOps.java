/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

import java.io.*;
import java.util.*;

/**
 *
 * @author kenne
 */
public class FileOps {
    private String filepath = "res/texts/users.txt";

    public FileOps () {

    }

    public HashMap<String, String> readFile() {
        HashMap<String, String> accounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
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
