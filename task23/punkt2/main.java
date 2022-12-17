package task23.punkt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        City cities[] = {
                new City("USA", "New York"),
                new City("USA", "Red Rock"),
                new City("Russia", "Moscow"),
                new City("France", "Paris"),
        };
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (City city : cities) {
            String key = city.getCountry();

            if (map.containsKey(key)) {
                map.get(city.getCountry()).add(city.getCity());
            }
            else {
                map.put(key, new ArrayList<>());
                map.get(city.getCountry()).add(city.getCity());
            }
        }
        System.out.println(map);
    }
}
