import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileCommanderCLI fileCommanderCLI = new FileCommanderCLI(System.in, System.out);
        fileCommanderCLI.eventLoop();
    }
}