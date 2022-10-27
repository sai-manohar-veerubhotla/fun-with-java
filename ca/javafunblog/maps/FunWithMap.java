package ca.javafunblog.maps;

import ca.javafunblog.collections.list.ListUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FunWithMap {


    // map
    //
    private static void mapFun() {
        Map<String, Integer> map = new HashMap<>();
        map.put("MONDAY", 5);
        map.put("TUESDAY", 4);
        map.put("WEDNESDAY", 3);
        map.put("THURSDAY", 2);
        map.put("FRIDAY", 1);
        map.put("SATURDAY", 0);
        map.put("SUNDAY", 4);
        System.out.println(map);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {

        }

        for (var entry : entries) {
            System.out.println(entry);
        }
//        entries.forEach(entry -> System.out.println(entry));
//        entries.forEach(System.out::println);

        System.out.println(map.get("MONDAY"));
        System.out.println(map.get("MONDAy")); // null
        System.out.println(map.containsKey("Monday"));
        System.out.println(map.containsValue(5));
//        System.out.println(map.getOrDefault());

        Map<Character, Integer> manohar = frequency("Manohar");
        System.out.println(manohar);
        System.out.println(manohar.getOrDefault("m", 0));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<Integer> values = map.values();
        System.out.println(values);





    }


    private static Map<Character, Integer> frequency(String string) {
        var result = new LinkedHashMap<Character, Integer>();
        for (char ch : string.toCharArray()) {
            if (!result.containsKey(ch)) {
                result.put(ch, 1);
            } else {
                result.put(ch, result.get(ch) + 1);
            }
        }

        return result;
    }

    private static Map<Day, Integer> attendance() {
        List<Integer> integers = ListUtil.list(7, 99);
        System.out.println(integers);
        return Map.of(Day.MONDAY, integers.get(0),
                Day.TUESDAY, integers.get(1),
                Day.WEDNESDAY, integers.get(2),
                Day.THURSDAY, integers.get(3),
                Day.FRIDAY, integers.get(4),
                Day.SATURDAY, integers.get(5),
                Day.SUNDAY, integers.get(6)
        );
    }


    public static void main(String[] args) {
        mapFun();

//        System.out.println(attendance());
    }
}
