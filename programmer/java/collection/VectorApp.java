package programmer.java.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Septiadi");
        list.add("Habib");

        for (var value : list){
            System.out.println(value);
        }

    }
}
