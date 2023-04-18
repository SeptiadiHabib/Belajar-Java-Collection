package programmer.java.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Septiadi");
        stack.offerLast("Habib");
        stack.offerLast("Now");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("Septiadi");
        deque.offerLast("Habib");
        deque.offerLast("Now");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
