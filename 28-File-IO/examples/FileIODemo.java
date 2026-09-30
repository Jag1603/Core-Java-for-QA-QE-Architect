import java.nio.file.*;

public class FileIODemo {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("qa-test-data.txt");
        Files.writeString(file, "Login,Chrome,PASS");
        System.out.println(Files.readString(file));
        Files.deleteIfExists(file);
    }
}