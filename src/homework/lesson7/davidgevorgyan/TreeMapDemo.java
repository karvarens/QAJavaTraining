package homework.lesson7.davidgevorgyan;


import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap <String, Integer> example = new TreeMap<>();
        task1(example,"Hello",2);
        task1(example,"World",3);
        System.out.println(example);
        System.out.println(task2(example));
        System.out.println(task3(example,"World"));
        System.out.println(task4(example,12));
        System.out.println(task5(example));
        task6(example);
        System.out.println(example);
        task1(example,"XYW",2);
        task1(example,"ABC",4);
        task1(example,"MNO",5);
        System.out.println(example);
        System.out.println(task7(example, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2);
            }
        }));
        System.out.println(task8Greatest(example));
        System.out.println(task8Least(example));
        System.out.println(task9Greatest(example));
        System.out.println(task9Least(example));
        System.out.println(task10(example));
        System.out.println(task11(example,"ABC"));
        System.out.println(task12(example,"ZZZ"));
        System.out.println(task13(example,"XYW"));
        System.out.println(task14(example,"ABC", false));
    }

    /**
     * Write a Java program to associate the specified value with the specified key in a Tree Map.
     * @param original original TreeMap
     * @param key TreeMap key
     * @param value TreeMap value
     * @param <K> Key Type
     * @param <V> Value Type
     */

    public static <K,V> void task1(TreeMap<K,V> original, K key, V value) {
        original.put(key,value);
    }

    /**
     * Write a Java program to copy a Tree Map content to another Tree Map
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return a new TreeMap which contain original entries
     */

    public static <K,V> TreeMap task2(TreeMap<K,V> original) {
        return new TreeMap<>(original);
    }

    /**
     * Write a Java program to search a key in a Tree Map.
     * @param original original TreeMap
     * @param key TreeMap key
     * @param <K> Key Type
     * @param <V> Value Type
     * @return search results
     */

    public static <K,V> boolean task3(TreeMap<K,V> original, K key) {
        return original.containsKey(key);
    }

    /**
     * Write a Java program to search a value in a Tree Map.
     * @param original original TreeMap
     * @param value TreeMap value
     * @param <K> Key Type
     * @param <V> Value Type
     * @return search results
     */

    public static <K,V> boolean task4(TreeMap<K,V> original, V value) {
        return original.containsValue(value);
    }

    /**
     * Write a Java program to get all keys from the given a Tree Map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return Set of keys
     */

    public static <K,V> Set task5(TreeMap<K,V> original) {
    return original.keySet();
    }

    /**
     * Write a Java program to delete all elements from a given Tree Map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     */

    public static <K,V> void task6(TreeMap<K,V> original) {
        original.clear();
    }

    /**
     * Write a Java program to sort keys in Tree Map by using comparator.
     * @param original original TreeMap
     * @param comparator comparator for a new TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return a new TreeMap
     */

    public static <K,V> TreeMap task7(TreeMap<K,V> original, Comparator<K> comparator) {
        TreeMap <K,V> result = new TreeMap<>(comparator);
        result.putAll(original);
        return result;
    }

    /**
     * Write a Java program to get a key-value mapping associated with the greatest key in a map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return Map entry
     */

    public static <K,V> Map.Entry task8Greatest(TreeMap<K,V> original) {
        return original.lastEntry();
    }

    /**
     * Write a Java program to get a key-value mapping associated with the least key in a map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return Map entry
     */

    public static <K,V> Map.Entry task8Least(TreeMap<K,V> original) {
        return original.firstEntry();
    }

    /**
     * Write a Java program to get the last (highest) key currently in a map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return the last (highest) key
     */

    public static <K,V> K task9Greatest(TreeMap<K,V> original) {
        return original.lastKey();
    }

    /**
     * * Write a Java program to get the first (lowest) key currently in a map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return the first (lowest) key
     */

    public static <K,V> K task9Least(TreeMap<K,V> original) {
        return original.firstKey();
    }

    /**
     * Write a Java program to get a reverse order view of the keys contained in a given map.
     * @param original original TreeMap
     * @param <K> Key Type
     * @param <V> Value Type
     * @return reversed keySet
     */

    public static <K,V> Set <K> task10(TreeMap<K,V> original) {
        return original.descendingKeySet();
    }

    /**
     * Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
     * @param original original TreeMap
     * @param originalKey Key which we are searching for
     * @param <K> Key Type
     * @param <V> Value Type
     * @return Map Entry with search results
     */

    public static <K,V> Map.Entry task11(TreeMap<K,V> original, K originalKey) {
        return original.floorEntry(originalKey);
    }

    /**
     * Write a Java program to get the greatest key less than or equal to the given key.
     * @param original original TreeMap
     * @param originalKey Key which we are searching for
     * @param <K> Key Type
     * @param <V> Value Type
     * @return Key with search results
     */

    public static <K,V> K task12(TreeMap<K,V> original, K originalKey) {
        return original.floorKey(originalKey);
    }

    /**
     * Write a Java program to get the portion of a map whose keys are strictly less than a given key.
     * @param original original TreeMap
     * @param originalKey Key which we are searching for
     * @param <K> Key Type
     * @param <V> Value Type
     * @return map whose keys are strictly less than a given key.
     */
    public static <K,V> SortedMap task13(TreeMap<K,V> original, K originalKey) {
        return original.headMap(originalKey);
    }

    /**
     * Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
     * @param original original TreeMap
     * @param originalKey Key which we are searching for
     * @param <K> Key Type
     * @param <V> Value Type
     * @param inclusive display is search is inclusive or not
     * @return map whose keys are less than (or equal to, if inclusive is true) a given key.
     */
    public static <K,V> SortedMap task14(TreeMap<K,V> original, K originalKey, boolean inclusive) {
        return original.tailMap(originalKey, inclusive);
    }
}
