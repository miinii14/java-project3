import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileCommander fileCommander = new FileCommander();

        fileCommander.cd(Path.of("/home/mini14/Downloads"));
        System.out.println(fileCommander.pwd());
        fileCommander.cd(Path.of(".."));
        System.out.println(fileCommander.pwd());

    }
}