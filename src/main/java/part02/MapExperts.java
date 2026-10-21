package part02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class contains a set of methods that you need to implement.
 *
 * Do not change the method signatures or fields, as these will be used by the
 * automated tests.
 *
 * These exercises have been applied from the course material of the MOOC
 * programming course (https://ohjelmointi-23.mooc.fi/osa-5). CC BY-NC-SA 4.0
 */
public class MapExperts {

    /**
     * Returns a Map containing the letters of the given word as keys and the
     * number of occurrences of each letter as values.
     *
     * For example, if the word is "hello", the returned Map contains the
     * following key-value pairs: { h -> 1, e -> 1, l -> 2, o -> 1 }
     *
     * You can assume that all letters are in lower case and that the given word
     * contains only letters.
     */
    public Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }

        return counts;
    }

    /**
     * Returns a new map that has the keys and values of the given map swapped.
     *
     * For example, if the given map contains the key-value pairs
     * { "one" -> 1, "two" -> 2, "three" -> 3 }
     * then the returned map contains the key-value pairs
     * { 1 -> "one", 2 -> "two", 3 -> "three" }
     */
    public Map<Integer, String> reverseMap(Map<String, Integer> map) {
        Map<Integer, String> reversed = new HashMap<>();

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            reversed.put(value, key);
        }

        return reversed;
    }

    /**
     * Creates a new map from the given list of Course objects. The keys of the map
     * are the course codes and the values are the Course objects. You can assume
     * that the course codes are unique.
     *
     * For example, if the list contains the following Course objects:
     * [Course("SOF001AS3A", "Ohjelmointi 2"),
     * Course("SOF004AS2A", "Python-ohjelmointi")]
     *
     * Then the returned map contains the following key-value pairs:
     *
     * "SOF001AS3A" -> Course("SOF001AS3A", "Ohjelmointi 2")
     * "SOF004AS2A" -> Course("SOF004AS2A", "Python-ohjelmointi")
     */
    public Map<String, Course> createMapFromList(List<Course> list) {
        Map<String, Course> courses = new HashMap<>();

        for (Course course : list) {
            courses.put(course.code(), course);
        }

        return courses;
    }
}
