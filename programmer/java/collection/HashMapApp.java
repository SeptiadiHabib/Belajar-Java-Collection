package programmer.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Septiadi");
        map.put("name.last", "Habib");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.last"));
    }
}
