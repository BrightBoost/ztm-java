package genericsandcollections.exercises.exercise7genericbag;

import java.util.List;
import java.util.ArrayList;

public class Bag<T> {
    private List<T> content;

    public Bag() {
        content = new ArrayList<>();
    }

    public void addItem(T item) {
        content.add(item);
    }

    public void removeItem(T item) {
        content.remove(item);
    }

    public List<T> getItems() {
        return content;
    }
}

