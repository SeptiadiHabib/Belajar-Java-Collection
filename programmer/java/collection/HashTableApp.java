package programmer.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Habib", "Habib");
        map.put("Eko", "Eko");
        map.put("Joko", "Joko");

        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
