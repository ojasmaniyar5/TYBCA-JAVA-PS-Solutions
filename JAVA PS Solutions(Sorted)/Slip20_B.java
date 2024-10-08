import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Slip20_B {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("CPP");
        list.add("Java");
        list.add("Python");
        list.add("PHP");

        // Display using Iterator
        System.out.println("Contents of the List:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display in reverse order using ListIterator
        System.out.println("\nContents of the List in Reverse Order:");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
