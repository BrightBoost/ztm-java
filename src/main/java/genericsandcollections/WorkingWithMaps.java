package genericsandcollections;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> nameAgesMap = new HashMap<>();
        nameAgesMap.put("Maaike", 31);
        nameAgesMap.put("Maria", 32);
        nameAgesMap.put("Lola", 25);

        System.out.println(nameAgesMap);
        System.out.println(nameAgesMap.get("Maaike"));

        for(Integer i : nameAgesMap.values()) {
            System.out.println(i);
        }

        for(String s : nameAgesMap.keySet()) {
            System.out.println(s + ": " + nameAgesMap.get(s));
        }

        for(Map.Entry<String, Integer> entry : nameAgesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        nameAgesMap.remove("Lola");
        nameAgesMap.put("Maaike", 32);

        System.out.println(nameAgesMap);
    }
}
