package task23.punkt1;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map.put("Уткин", "Никита");
        map.put("Крылов", "Кирилл");
        map.put("Векторов", "Дамир");
        map.put("Векторов2", "Дамир");
        map.put("Векторов7", "Дамир");
        map.put("Векторов6", "Дамир");
        map.put("Векторов5", "Дамир");
        map.put("Векторов4", "Дамир");
        map.put("Векторов3", "Дамир");
        map.put("Дронов", "Никита");
        for (String key: map.keySet()) {
            int count = 0;
            String value = map.get(key);
            if (!map2.containsValue(value)) {
                Iterator<String> it = map.values().iterator();
                while (it.hasNext()) {
                    String str = it.next();
                    if (str.equals(value)) {
                        count += 1;
                    }
                }
                if (count == 1) {
                    map2.put(key, value);
                }
            }
        }

        System.out.println(map);
        System.out.println(map2);
        //Set<Object> uniqueValues = new HashSet<Object>(map.values());
        //System.out.println(uniqueValues);
    }
}
