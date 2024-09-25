package hexlet.code;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String format) throws IOException {
        String content1 = Reader.readFile(filePath1);
        String content2 = Reader.readFile(filePath1);

        String fileformat1 = Reader.getFileType(filePath1);
        String fileformat2 = Reader.getFileType(filePath2);

        Map<String, Object> file1 = Parser.parse(content1, filePath1);
        Map<String, Object> file2 = Parser.parse(content2, filePath2);

        List<Map<String, Object>> comparedResult = Comparator.compare(file1, file2);

        return StylishFormatter.format(comparedResult);
    }
}
