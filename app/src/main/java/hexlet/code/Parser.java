package hexlet.code;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static Map<String, Object> parse(String content, String format) throws IOException {
        Map<String, Object> result = new HashMap<>();
        if (format.equals("json")) {
            ObjectMapper mapper = new ObjectMapper();
            result = mapper.readValue(content, Map.class);
        }
        return result;
    }
}
