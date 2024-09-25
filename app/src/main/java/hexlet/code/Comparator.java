package hexlet.code;

import java.util.*;

public class Comparator {
       public static List<Map<String, Object>> compare(Map<String, Object> file1, Map<String, Object> file2) {

        List<Map<String, Object>> result = new ArrayList<>();
        Set<String> keys = new HashSet<>(file1.keySet());
        keys.addAll(file1.keySet());
        keys.addAll(file2.keySet());

        for (String key: keys) {
            Object value1 = file1.get(key);
            Object value2 = file2.get(key);

            Map<String, Object> node = new HashMap<>();
            node.put("key", key);

            if (!file2.containsKey(key)) {
                node.put("type", "deleted");
                node.put("value", value1);
            }

            else if (!file1.containsKey(key)) {
                node.put("type", "added");
                node.put("value", value2);
            }

            else if(file1.containsKey(key) && file2.containsKey(key) && value1.equals(value2)) {
                node.put("type", "unchanged");
                node.put("value", value1);
            }

            else {
                node.put("type", "changed");
                node.put("value1", value1);
                node.put("value2", value2);
            }
            result.add(node);

        }
    return (result);

    }

}


