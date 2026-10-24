package exercises.week1;

import java.util.HashMap;
import java.util.List;

public class Exercises {
    public static boolean hasDuplicates(List<String> ids) {
        HashMap<String, Boolean> duplicatesMap = new HashMap<>();
        for (String id : ids) {
            if (duplicatesMap.get(id) != null) {
                return true;
            }
            duplicatesMap.put(id, false);
        }
        return false;
    }
}
