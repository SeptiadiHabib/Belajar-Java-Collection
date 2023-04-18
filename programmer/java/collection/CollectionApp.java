package programmer.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Septiadi");
        collection.add("Habib");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Septiadi");
        collection.remove("Budi");
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Habib")
        );
        System.out.println(
                collection.containsAll(List.of("Habib", "Programmer"))
        );

        System.out.println(collection.size());
    }
}
