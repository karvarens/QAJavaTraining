package auditorium.collection.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRelatedTasks {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

//        TreeMap<String, Double> map = new TreeMap<>();
        Map<String, Double> map = new HashMap<>();
        map.put("1", 1.);
        map.put("2", 1.);
        map.put("3", 1.);
        map.put("4", 1.);
        Map<String, Double> copyMap = task2(map);
        System.out.println(copyMap);


    }

    /**
     * 1. Write a Java program to associate the specified value with the specified key in a Tree Map. 
     *
     * @param key
     * @param value
     * @return
     */
    static TreeMap<String, Double> task1(String key, Double value) {

        Map<String, Double> resultMap = new TreeMap<>();
        resultMap.put(key, value);

        return (TreeMap<String, Double>) resultMap;
    }


    /**
     * 2. Write a Java program to copy a Tree Map content to another Tree Map.
     *
     * @param original
     * @return
     */
    static Map<String, Double> task2(Map<String, Double> original) throws IllegalAccessException, InstantiationException {
        Class<Map<String, Double>> resultMapType = (Class<Map<String, Double>>)original.getClass();
        Map<String, Double> resultMap = resultMapType.newInstance();
        resultMap.putAll(original);
        return resultMap;

    }

}

//  3. Write a Java program to search a key in a Tree Map.
//  4. Write a Java program to search a value in a Tree Map.
//  5. Write a Java program to get all keys from the given a Tree Map.
//  6. Write a Java program to delete all elements from a given Tree Map.
//  7. Write a Java program to sort keys in Tree Map by using comparator.