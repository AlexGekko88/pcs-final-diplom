import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BooleanSearchEngine engine = new BooleanSearchEngine(new File("pdfs"));
        Server server = new Server(8989, engine);
        server.start();
    }
}

