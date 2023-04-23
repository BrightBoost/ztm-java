package genericsandcollections;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(10);
        integerSet.add(100);
        integerSet.add(10);

        System.out.println(integerSet);

        for(Integer i : integerSet) {
            System.out.println(i);
        }
    }
}
