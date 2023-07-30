/*The frequency of characters in a string refers to the number of occurrences of each individual character within the given string. In other words, it represents how many times each character appears in the string.

For example, consider the string "hello". The frequency of characters in this string is as follows:

The character 'h' appears once.
The character 'e' appears once.
The character 'l' appears twice.
The character 'o' appears once.*/

package basic_lvl;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        String input = "hello, world!";
        Map<Character, Integer> frequencyMap = getCharacterFrequency(input);

        System.out.println("Character frequency in the string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }

    public static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
