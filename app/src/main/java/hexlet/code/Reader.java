package hexlet.code;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
    public static String readFile (String filePath) throws IOException {
        Path writeFilePath = Paths.get(filePath);
        return Files.readString(writeFilePath);
    }

    public static String getFileType (String filePath) {
        var fileType = filePath.split(":");
        return fileType[1];
    }
}
