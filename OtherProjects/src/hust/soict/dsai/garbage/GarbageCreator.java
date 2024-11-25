package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filePath = "file.txt"; 
        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            String fileContent = "";
            
            for (byte b : fileBytes) {
                fileContent += (char) b; 
            }

            System.out.println("File length: " + fileContent.length());
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}
