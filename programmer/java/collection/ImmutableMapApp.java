package programmer.java.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singelton = Collections.singletonMap("name", "Septiadi");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Septiadi");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Septiadi",
                "middle", "Habib",
                "last", "Now"
        );

        //map.put("a", "A");
    }
}
