package programmer.java.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Septiadi", "Habib", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> habib = names.tailSet("Habib",true);

        for (var name : habib){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        //immutable.add("OW");
    }
}
