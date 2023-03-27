import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileCommander fileCommander = new FileCommander();

        fileCommander.cd(Path.of("/home/mini14/Programing"));
        System.out.println(fileCommander.pwd());
        System.out.println(fileCommander.ls());
    }
}