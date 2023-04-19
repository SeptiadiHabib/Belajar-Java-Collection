package programmer.java.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Ssptiadi", "Septiadi");
        map.put("Habib", "Habib");
        map.put("Erik", "Erik");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Habib"));
        System.out.println(map.higherKey("Habib"));
        System.out.println(map.floorKey("Erik"));
        System.out.println(map.ceilingKey("Erik"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        //immutable.put("Habib", "Habib"); //error
    }
}
