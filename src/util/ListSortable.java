package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list;

    public ListSortable() {
        list = new ArrayList<>();
    }

    public void add(E element) {
        list.add(element);
    }

    public void print() {
        Collections.sort(list);
        for (E e : list) {
            System.out.println(e);
        }
    }
}
