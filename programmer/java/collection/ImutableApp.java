package programmer.java.collection;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Habib");
        mutable.add("Septiadi");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Septiadi", "Habib");

    }
}
