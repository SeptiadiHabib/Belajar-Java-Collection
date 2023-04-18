package programmer.java.collection;

import programmer.java.collection.data.Person;
import programmer.java.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Septiadi"));
        people.add(new Person("Habib"));

        for (var person : people ){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Joko"));
    }
}
