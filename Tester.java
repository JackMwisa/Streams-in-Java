package StreamApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/file.txt");

        // Try reading the file using Streams
        try (Stream<String> lines = Files.lines(filePath)) {

            // Print each line from the file
            lines.forEach(System.out::println);
        } catch (IOException e) {
            // Handle any potential IOException
            System.err.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}
