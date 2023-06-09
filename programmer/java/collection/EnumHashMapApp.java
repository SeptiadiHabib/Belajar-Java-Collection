package programmer.java.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level{
        FREE, STANDART, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Septiadi");
        map.put(Level.VIP, "Habib");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
