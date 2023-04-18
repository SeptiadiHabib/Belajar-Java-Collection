package programmer.java.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Habib");

        Set<String> mutable = new HashSet<>();
        mutable.add("Habib");
        mutable.add("Septiadi");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Habib", "Septiadi");

        //set.add("Rudi");
    }
}
